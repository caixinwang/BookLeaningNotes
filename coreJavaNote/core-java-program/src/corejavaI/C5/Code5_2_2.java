package corejavaI.C5;

import java.util.Objects;

public class Code5_2_2 {//equals方法
    static class A{
        int a;

        public A(int a) {
            this.a = a;
        }

        /**
         * 基于状态检测对象的相等性
         * getClass方法返回一个对象所属的类。同一个实际类型会返回相同的Class对象
         * @param o
         * @return
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            A a1 = (A) o;

            return a == a1.a;
        }

        @Override
        public int hashCode() {
            return a;
        }
    }

    static class B extends A{
        private int b;

        public B(int a, int b) {
            super(a);
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if(!super.equals(o))return false;
            //父类的字段都相等才比较子类的字段。
            B b1 = (B) o;

            return b == b1.b;
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + b;
            return result;
        }
    }

    static class C{
        private int money;
        private String name;

        public C(int money, String name) {
            this.money = money;
            this.name = name;
        }

        /**
         * 不能简单的用name.equals(c.name)，因为怕name是空。
         * equals(name,c.name)相当于是name!=null?name.equals(c.name):name==c.name;
         * @param o
         * @return
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            C c = (C) o;

            if (money != c.money) return false;
            return Objects.equals(name, c.name);
        }

        @Override
        public int hashCode() {
            int result = money;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }
}
