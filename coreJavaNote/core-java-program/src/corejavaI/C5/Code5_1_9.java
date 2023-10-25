package corejavaI.C5;

public class Code5_1_9 {//抽象类
    /**
     * 1.如果我们在一个更高的层次不好实现一个方法，当时在它的子类又都需要实现这个方法，那么我们不妨将它设置为一个抽象方法，这样我们就
     * 不必返回一个默认值了，我们可以完全不需要实现它。至少有一个抽象方法的类一定也要声明为抽象类。在它的子类中可以实现抽象方法。
     * 2.拓展抽象类有两种选择：在子类中仍然保留部分或全部的抽象方法，这样子类依然是抽象类。或者定义全部的抽象方法，这样一来子类就可以
     * 不是抽象类了。即使不含抽象方法，我们也可以把类声明为抽象的，但是我们一般认为没有抽象方法就不是抽象类。
     * 3.抽象类不能实例化，但是它可以引用它的非抽象子类。抽象类的引用变量只能引用它的非抽象子类，因为它不能实例化。
     * 4.抽象类引用变量可以调用子类实现的所有抽象方法，这通过动态绑定来实现。
     */
    static abstract class A{
        private int a;
        public abstract int f();//和声明字段一样。这里不能有大括号（实现）

        public A(int a) {
            this.a = a;
        }
    }
    static class B extends A{
        private int b;

        public B(int a, int b) {//A类中没有无参构造器了，这里不手动调用a的构造器就会报错。因为这样从A继承的字段无法初始化。
            super(a);
            this.b = b;
        }

        @Override
        public int f() {
            return 1;
        }
    }
    static class C extends A{
        private int c;

        public C(int a, int c) {
            super(a);
            this.c = c;
        }

        @Override
        public int f() {
            return 2;
        }
    }

    public static void main(String[] args) {
        A[] as=new A[2];
        as[0]=new B(1,2);
        as[1]=new C(1,2);
        for (A a : as) {
            System.out.println(a.f());
        }
    }

}
