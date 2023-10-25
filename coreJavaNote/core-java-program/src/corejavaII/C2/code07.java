package corejavaII.C2;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class code07 {

    @Test
    public void test01(){

    }

    @Test
    public void test02(){
//        printMatchResults("[Jj]ava",false,"java","javaa","Java");
//        printMatchResults("\\w*",false,"java","javaa","Java");//java中\是特殊字符，需要额外一个\来转义

        //Pattern.asPredicate()可以用在流里面
        List.of("java","Java","Jaaaaaa")
                .stream()
                .filter(Pattern.compile("[Jj]ava").asPredicate())
                .forEach(System.out::println);

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
                .forEach((str)-> System.out.println(str+" : "+(p.matcher(str).matches()?"匹配":"不匹配")));
    }



}
