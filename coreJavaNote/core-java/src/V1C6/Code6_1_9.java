package V1C6;

public class Code6_1_9 implements Cloneable{//对象克隆
    static class A implements Cloneable{
        private int a;

        public A(int a) {
            this.a = a;
        }
    }

    static class B implements Cloneable{
        private int b;

        public B(int b) {
            this.b = b;
        }

        @Override
        public B clone() throws CloneNotSupportedException {//改成公共的clone方法，才能在别的类中调用
            return (B)super.clone();
        }
    }

    static class C implements Cloneable{
        private int c;
        private B b;

        public C(int c, B b) {
            this.c = c;
            this.b = b;
        }

        /**
         * 深拷贝。要对克隆出来的对象的引用类型字段再次克隆
         * @return
         * @throws CloneNotSupportedException
         */
        @Override
        public C clone() throws CloneNotSupportedException {
            C c=(C)super.clone();
            c.b=b.clone();
            return c;
        }
    }

    public static void main(String[] args) throws Exception{
        A a=new A(1);
//        A a1=a.clone();//报错，受保护的clone方法在这里只能复制Code619
        //子类只能调用受保护的clone方法来克隆它自己的对象。例如下面只能在类Code619的main函数中复制它自己的对象
        Code6_1_9 code6_1_9=new Code6_1_9();
        Code6_1_9 code6_1_91=(Code6_1_9) code6_1_9.clone();

        B b=new B(3);
        B b2=b.clone();
    }
}
