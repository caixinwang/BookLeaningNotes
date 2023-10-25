package V1C6;

public class Code6_1_2 {//接口的属性
    //接口不是类，不能实例化。（类比抽象类）

    static class A implements Comparable<A>{
        private int a;

        public A(int a) {
            this.a = a;
        }

        @Override
        public int compareTo(A o) {
            if (!(getClass()!=o.getClass())) throw new ClassCastException();
            return Integer.compare(a,o.a);
        }
    }

    public interface Moveable{
        void move();//自动当做是public
        double PI=3.1415926;//自动就是public static final。不能包含实例字段但是可以包含常量（一定是类常量）
    }

    public interface Moveable2 extends Moveable{
        void move2();
    }

    static class B implements Cloneable,Comparable{//可以实现多个接口
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Comparable x;//可以定义一个接口对象，并且可以引用实现了这个接口的对象
        x=new A(1);
    }

}
