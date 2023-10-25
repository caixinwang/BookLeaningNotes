package V1C4;

import java.time.LocalDate;

public class Code4_4_5 {

    static class A {
        private int a;

        public A(int a) {
            this.a = a;
        }

        public A(){

        }

        public int getA() {
            return a;
        }

        /**
         * 用静态工厂方法创建对象。工厂方法名可以不同于构造器，名字可以自己起。并且可以返回自己的子类，这也是构造器做不到的。
         */
        public static A By1(int x){//自己起名字
            return new A(x);
        }

        public static B By2(int x){//返回自己的子类
            return new B(x*x);
        }

    }

    static class B extends A{
        private int b;
        private   B(int x){
            b=x;
        }
    }

    public static int f(int x){//4.4.5
        return x+3;
    }

    public int f2(int x){//4.4.5
        return f(x)+1;
    }

    public static void main(String[] args) {
        System.out.println(A.By1(2).a);
        System.out.println(A.By2(2).b);
        System.out.println(f(5));//在类的方法里面（实例或静态）使用自己类的静态方法都不需要加类名
    }

}
