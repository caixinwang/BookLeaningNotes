package V1C5;

import java.util.Objects;

public class Code5_2_3 {//equals方法
    /**
     * A和B相等性都根据A中的a来。这样A的子类都按照A的相等标准来。A中的equals方法设置为final
     */
    static class A{
        private int a;
        private String name;
        public A(int a,String name) {
            this.a = a;
            this.name=name;
        }
        @Override
        public final boolean equals(Object otherObject){
            if (this==otherObject)return true;
            if (otherObject==null)return false;
            if (!(otherObject instanceof A)) return false;
            A other=(A) otherObject;
            return a==other.a
                    && Objects.equals(name,other.name);
        }
    }
    static class B extends A{
        public B(int a, String name, int b) {
            super(a, name);
            this.b = b;
        }
        private int b;
    }


    static class E extends A{
        private int e;

        public E(int a, String name, int e) {
            super(a, name);
            this.e = e;
        }
    }
    /**
     *C和子类D都有自己的判断规则，所以用getClass来比较
     */
    static class C{
        private int c;
        private String name;

        public C(int c, String name) {
            this.c = c;
            this.name = name;
        }

        @Override
        public boolean equals(Object otherObject){
            if (this==otherObject)return true;
            if (otherObject==null)return false;
            if (this.getClass()!=otherObject.getClass()) return false;
            C other=(C) otherObject;
            return c==other.c
                    && Objects.equals(name,other.name);
        }
    }
    static class D extends C{

        private int d;

        public D(int c, String name, int d) {
            super(c, name);
            this.d = d;
        }
        @Override
        public boolean equals(Object otherObject){
            super.equals(otherObject);
            D other=(D)otherObject;
            return d==other.d;
        }
    }

    public static void main(String[] args) {
        A a=new A(1,"a");
        B b=new B(1,"a",3);
        E e=new E(1,"a",4);
        System.out.println(a.equals(b));
        System.out.println(a.equals(e));
        System.out.println(b.equals(e));
        System.out.println("=====================================");
        C c=new C(1,"jame");
        D d=new D(1,"jame",4);
        D d1=new D(1,"jame",3);
        System.out.println(c.equals(d));
        System.out.println(c.equals(d1));
        System.out.println(d.equals(d1));
    }
}
