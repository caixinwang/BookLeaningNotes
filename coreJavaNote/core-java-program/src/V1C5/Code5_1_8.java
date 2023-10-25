package V1C5;

public class Code5_1_8 {//对象引用的强制类型转换

    /**  继承关系  上 -> 下
     *    A -> B -> C
     *           -> D
     */
    static class A {
        private int a;
    }

    static class B extends A {
        private int b;
    }

    static class C extends B {
        private int c;
    }
    static class D extends B{
        private int d;
    }

    public static void main(String[] args) {
        A a ;
        B b = new B();
        C c = new C();
        /**
         * 只有实际类型是向上转型（要转的类型是你的父类、上游类）才会成功，也就是实际类型要和转换类型相同，或者是转换类型的子类。
         * 这里a变量的实际类型是C，C实际类型是可以强制转换成它的父类B的。
         * instanceof：c向上的继承链上有没有B类型---包括直接子类和间接子类。理解：一个类型一定是它的父类或自己的一个实例
         */
        a=c;
        B b1=(B)a;
        if (c instanceof B) System.out.println("yes");
        Object o=new D();
        if (o instanceof B) System.out.println("!!!!yes");

        /**
         * 声明类型向下转型，实际类型向上转型。也就是说a声明类型A要变成B类型，是向下转型的，能否成功要看a变量的真实类型是什么，
         * 真实类型如果是向上转型的那么就能成功。这里a变量的真实类型是C，C向上的继承链有B，所以可以成功！
         * 由于只有实际类型是向上转型才会成功。所以在转化之前利用x instanceof B 判断一下x向上的继承链中有没有B类型
         */
        if (c instanceof B) {
            a=(B)c;
            System.out.println("yes!!");
        }
        /**
         * 只有要调用子类特定方法的时候才需要强制类型转化。如果是要调用子类覆盖的方法，那么动态绑定可以帮我们找到正确的方法
         * 一般情况尽量少使用强制类型转化和instanceof操作符
         */
    }

}
