package V1C5;

import java.util.Arrays;
import java.util.Objects;

public class Code5_2_5 {//toString 方法
    static class A{
        private int a;
        private String name;

        public A(int a, String name) {
            this.a = a;
            this.name = name;
        }

        @Override
        public String toString() {//用getClass来获取类名
            return getClass().getName()+"{" +
                    "a=" + a +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    static class B extends A{
        private int b;

        public B(int a, String name, int b) {
            super(a, name);
            this.b = b;
        }

        @Override
        public String toString() {//由于超类使用的是getClass，所以这里可以利用
            return super.toString()+"{" +
                    "b=" + b +
                    '}';
        }
    }

    public static void main(String[] args) {
        B jame = new B(1, "jame", 2);
        A jack=new A(3,"jack");
        System.out.println(jame);
        System.out.println(jack);

        /**
         * 数组的toString方法是继承自Object的，打印方式奇怪。可以用Arrays中的方法解决
         */
        int[] arr={1,23,5,7,9,6,4};
        System.out.println(Arrays.toString(arr));
        Object[] os=new Object[2];
        os[0]=jame;
        os[1]=jack;
        System.out.println(Arrays.toString(os));
    }
}
