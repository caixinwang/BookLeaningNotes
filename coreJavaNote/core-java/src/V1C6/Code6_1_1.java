package V1C6;

public class Code6_1_1 {//接口的概念--Comparable接口

    /**
     * A和A的子类有各自的比较方法。也就是说类型不一样没有办法比较大小，直接报错
     */
    static class A implements Comparable<A>{
        private int a;

        public A(int a) {
            this.a = a;
        }

        @Override
        public int compareTo(A o) {
            if (!(getClass()==o.getClass()))throw new ClassCastException();
            return Integer.compare(a,o.a);
        }
    }

    static class B extends A {
        private int b;

        public B(int a, int b) {
            super(a);
            this.b = b;
        }

        @Override
        public int compareTo(A o) {
            if (!(getClass()==o.getClass()))throw new ClassCastException();
            return Integer.compare(b,((B)o).b);
        }
    }

    /**
     * C和C的子类，比较的都是c字段，所以在C类中把比较方法声明为final。C类和C的子类都是沿用这个方法进行比较
     */
    static class C implements Comparable<C>{
        private int c;

        public C(int c) {
            this.c = c;
        }

        /**
         * C类和C的子类都是按照同一个比较标准，所以把compareTo方法设置为final。
         * 如果o是c的子类，那么ok，可以直接传进来。
         * @param o the object to be compared.
         * @return
         */
        @Override
        public final int compareTo(C o) {
            if (!(o instanceof C)) throw new ClassCastException();

            return Integer.compare(c,o.c);
        }
    }

    static class D extends C{
        private int d;

        public D(int c, int d) {
            super(c);
            this.d = d;
        }
    }

    public static void main(String[] args) {
        A a=new A(1);
        B b=new B(1,3);
        C c=new C(2);
        D d=new D(2,5);

        try {
            System.out.println(a.compareTo(b));
        } catch (ClassCastException e) {
            System.out.println(e);
        }

        try {
            System.out.println(b.compareTo(a));
        } catch (ClassCastException e) {
            System.out.println(e);
        }

        System.out.println(c.compareTo(d)==0?"equals":"not equals");
        System.out.println(d.compareTo(c)==0?"equals":"not equals");
    }

}
