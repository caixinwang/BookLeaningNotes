package V1C5;

public class Code5_2_1 {//Object类型的变量
    /**
     * Object类型的变量可以引用任何类型的对象，作为一个泛型容器，想要对其中的内容进行操作需要清楚实际类型并进行强制类型转化
     * 在Java中只有基本类型不是对象。所有的数组类型，不管是对象数组还是基本类型的数组都拓宽了Object类
     */
    static class A{
        private int a;

        public A(int a) {
            this.a = a;
        }

        public int f(){
            return -1;
        }
    }

    public static void main(String[] args) {
        Object a=new A(1);
        A a1=(A)a;
        System.out.println(a1.f());
        System.out.println(((A) a).f());
        A[] as=new A[2];
        int[] arr=new int[2];
        Object o1=as;
        Object o2=arr;


    }

}
