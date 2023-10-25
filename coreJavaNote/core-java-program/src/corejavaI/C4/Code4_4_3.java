package corejavaI.C4;

public class Code4_4_3 {
    /**
     * 1.静态方法是不在对象上执行的方法。也就是说使用静态方法的时候不需要创建一个具体的对象，但是具体的对象也是可以使用静态方法的。
     * 在完成计算时，静态方法不需要使用任何对象，也就是说它没有隐式参数，可以认为静态方法是没有this参数的方法。
     * 2.静态方法不能访问实例字段，但是可以访问静态字段，无论是静态变量还是静态常量都是可以的。
     * 3.下面两种情况使用静态方法：方法不需要访问对象状态，它所需要的所有参数都通过显式参数提供；方法只需要访问类的静态字段。
     */

    public static final int N=3;
    public static int N2=4;

    public static int add(int a,int b){
        return a+b;
    }

    public int minus(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(Code4_4_3.add(1,N));
        System.out.println(new Code4_4_3().add(1,N2));//具体对象也可以使用静态方法
        System.out.println(new Code4_4_3().minus(N,1));
    }
}
