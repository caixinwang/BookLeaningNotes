package corejavaII.C2;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class code07 {

    @Test
    public void test01(){

    }

    @Test
    public void test2_7_2(){
//        printMatchResults("[Jj]ava",false,"java","javaa","Java");
//        printMatchResults("\\w*",false,"java","javaa","Java");//java中\是特殊字符，需要额外一个\来转义

        //Pattern.asPredicate()可以用在流里面
//        List.of("java","Java","Jaaaaaa")
//                .stream()
//                .filter(Pattern.compile("[Jj]ava").asPredicate())
//                .forEach(System.out::println);

//        printMatchResults("[Jj]?ava",false,"java","javaa","Java","jjava","ava");
//        printMatchResults("[Jj]+ava",false,"java","javaa","Java","jjava","ava");

        //1.吝啬匹配:只要能使得匹配成功，我往少的去匹配
        //2.贪婪匹配:只要能匹配成功就一直匹配，不管是否会导致匹配失败
        //3.正常：只要能成功，往多的去匹配
//        printMatchResults("[Jj]*?java",false,"java","javaa","Java","jjava","ava");//1
//        printMatchResults("[Jj]*+java",false,"java","javaa","Java","jjava","ava");//2
//        printMatchResults("[Jj]*java",false,"java","javaa","Java","jjava","ava");//3

//        printMatchResultAndGroup("([Jj]*+)(j?)(ava)","jjjjjava");//贪婪
//        printMatchResultAndGroup("([Jj]*?)(j?)(ava)","jjjjjava");//吝啬
//
//        printMatchResultAndGroup("([Jj]*+)(j)(ava)","jjjjjava");//贪婪不会顾全大局，可能会导致失败
//        printMatchResultAndGroup("([Jj]*?)(j)(ava)","jjjjjava");//吝啬的会顾全大局

        printMatchResultAndGroup("([Jj]*+)(j+)(ava)","jjjjjava");//贪婪直接导致失败
        printMatchResultAndGroup("([Jj]*?)(j+)(ava)","jjjjjava");//吝啬的发现j+可以完成任务，然后自己就不干活了


    }

    @Test
    public void test2_7_3(){
        String exp="[jJ]+ava",str="javajjavajjjjjavajj";
        Pattern p=Pattern.compile(exp);
        //这里的results()返回一个Stream<MatchResult>，Matcher本身就是一个实现了MatchResult接口的类
        //group()等价于group(0)也就是返回整个匹配的字符串
        p.matcher(str)
                .results()
                .map(MatchResult::group).
                forEach(System.out::println);
    }

    @Test
    public void test2_7_3_2(){//程序清单2-7
        String url="https://baike.baidu.com/item/%E6%B8%85%E6%9C%9D/175141?fromtitle=%E4%B8%AD%E5%8D%8E%E5%A4%A7%E6%B8%85%E5%9B%BD&fromid=15186811";
        try(InputStream in=new URL(url).openStream()) {
            String input=new String(in.readAllBytes(), StandardCharsets.UTF_8);
            var patternString="<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>]*)\\s*>";
//            System.out.println(input);
            Pattern pattern=Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
            pattern.matcher(input)
                    .results()
                    .map(MatchResult::group)
                    .forEach(System.out::println);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 打印出匹配的群组对应的字符串
     * @param exp 正则表达式
     * @param str 要进行匹配的字符串
     */
    public static void printMatchResultAndGroup(String exp,String str){
        Pattern p=Pattern.compile(exp);
        Matcher matcher = p.matcher(str);
        //Matcher 的start和end 代表的是匹配的字符串的起始下标和结束下标
        System.out.println("字符串 \""+str+"\" 匹配 正则表达式 \""+exp+"\"");
        if (matcher.matches()){
            System.out.println("匹配成功！");
            for (int i=1;i<=matcher.groupCount();i++){
                System.out.println(matcher.group(i));
            }
        }else {
            System.out.println("匹配失败！");
        }
        System.out.println();
    }

    /**
     *
     * @param exp 正则表达式字符串
     * @param onlyPrintSuccess @true的时候只打印匹配的，@false的时候不管是否匹配都打印
     * @param strList 要匹配的变长字符数组
     */
    public static void printMatchResults(String exp,boolean onlyPrintSuccess,String... strList){
        //实现了CharSequence的类有：String，StringBuilder、StringBuffer
        //Pattern.matcher(CharSequence input)返回一个Mather
        //Mather.matches()返回是否匹配
        Pattern p=Pattern.compile(exp);
        System.out.println("正则表达式："+exp);
        List.of(strList)
                .stream()
                .filter((str)->!onlyPrintSuccess||p.matcher(str).matches())
                .forEach((str)-> System.out.println(str+" : "+(p.matcher(str).matches()?"y":"n")));
    }



}
