package V1C5;

public class Code5_7_1 {//Class类

    static class A{

    }

    public static void main(String[] args) {
        A a = new A();
        Class aClass = A.class;//类型.class
        Class<? extends A> aClass1 = a.getClass();//对象实例.getClass
        try {//调用Class.forName需要提供一个异常处理器
            Class<?> a1 = Class.forName("A");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        Class<Integer> integerClass = int.class;
        Class<double[]> aClass2 = double[].class;
        System.out.println(aClass2.getName());

    }
}
