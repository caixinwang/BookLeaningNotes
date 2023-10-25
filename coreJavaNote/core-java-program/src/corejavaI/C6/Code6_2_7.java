package corejavaI.C6;

import java.util.Arrays;
import java.util.function.*;

public class Code6_2_7 {//处理lambda表达式
    public static void p(int times,Runnable runnable){
        for (int i = 0; i < times; i++) {
            runnable.run();//Runnable接口中的run方法是一个无参数的void方法
        }
    }

    public static String supply(int times, Supplier<String>stringSupplier){
        String s="";
        for (int i = 0; i < times; i++) {
            s+=stringSupplier.get();
        }
        return s;
    }

    public static void p2(int times, Consumer<Integer> consumer){
        for (int i = 0; i < times; i++) {
            consumer.accept(i);//自动装箱
        }
    }
    public static void sort(int[] arr , BiPredicate<Integer,Integer> biPredicate){//
        int N=arr.length;
        for (int i=1;i<N;i++){
            for (int j=i;j>0&& biPredicate.test(arr[j],arr[j-1]);j--){//test<==>小于
                swap(arr,j,j-1);
            }
        }
    }

    public static void sort(int[] arr , BinaryOperator<Integer> binaryOperator){//定义操作符，相当于比较器
        int N=arr.length;
        for (int i=1;i<N;i++){
            for (int j=i;j>0&& binaryOperator.apply(arr[j],arr[j-1])<0;j--){//test<==>小于
                swap(arr,j,j-1);
            }
        }
    }

    public static void swap(int[] arr,int a,int b){
        int i = arr[a];
        arr[a]=arr[b];
        arr[b]=i;
    }

    public static String add(String a,String b,BinaryOperator<String>binaryOperator){
        return binaryOperator.apply(a,b);
    }

    public static int op(int a,UnaryOperator<Integer> unaryOperator){
        return unaryOperator.apply(a);
    }

    public static void main(String[] args) {
        p(5,()->{
            System.out.println(123);
        });

        System.out.println(supply(3, () -> {
            return "456";
        }));

        p2(4,System.out::println);

        int[] arr={4,3,2,1};
        sort(arr,(Integer a,Integer b)->{
            return a<b;
        });
        System.out.println(Arrays.toString(arr));

        int[] arr1={7,6,5,1,3,4,9};
        sort(arr1,(Integer a,Integer v)->{
            return a-v;
        });
        System.out.println(Arrays.toString(arr1));

        System.out.println(add("ab","c",(String a,String b)->{//操作符
            return a+b;
        }));

        System.out.println(op(3,(Integer a)->{
            return -a;
        }));



    }

}
