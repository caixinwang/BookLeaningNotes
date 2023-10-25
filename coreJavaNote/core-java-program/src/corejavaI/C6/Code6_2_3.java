package corejavaI.C6;

import java.util.Arrays;

public class Code6_2_3 {//函数式接口/方法引用
    //函数式接口就是只有一个抽象方法的接口

    public interface P{
        void p(String s);
    }

    public interface S{
        void s();
    }

    public  int f(int a){
        return a*a;
    }

    public static int f2(int a){
        return a*a;
    }

    public interface D {
        int d(int a);
    }

    public interface  s{
        String s(int a);
    }


    public static void main(String[] args) {
        String[] arr={"123","123456","123456789","122","1","12"};
        Arrays.sort(arr,(String a,String b)->a.length()-b.length());
        System.out.println(Arrays.toString(arr));
        //函数引用
        P p=System.out::println;//这里会把String s作为println的参数
        S s=System.out::println;//这里是无参的println
        p.p("yes");
        s.s();
        p.p("yes");
        //就是将调用时候的.变成了:: 并且省略了括号。
        //接口是定义一个方法，其中有接收参数，接收来的参数用来干嘛，就是可以用到我们方法引用中。
        Code6_2_3 code6_2_3=new Code6_2_3();
        D d=code6_2_3::f;
        D d1=Code6_2_3::f2;
        System.out.println(d.d(4));
        System.out.println(d1.d(5));
        d=(int a)->{
          return code6_2_3.f(a);
        };
        s s1=Integer::toString;
    }
}
