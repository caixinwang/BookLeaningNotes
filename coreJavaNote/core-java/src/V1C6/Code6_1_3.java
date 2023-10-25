package V1C6;

public class Code6_1_3 {//接口与抽象类
    //为什么要有接口的概念，而不是用抽象类呢？原因是一个类不能继承多个类，但是可以实现多个接口.---java是单继承的
    //在java8中可以在类中添加增加静态方法。java9中还可以增加私有方法，但是这种方法只能作为接口中其它方法的辅助方法
    //在接口中，在一个方法前增加上default关键字就可以为这个方法定义默认方法，如果实现这个接口的类没有显式的实现这个方法，那么将默认使用
    //这个方法。默认方法可以使用接口中其它的方法。因为接口中其它的方法一定是要实现的。默认方法的一个重要用途是接口演化，如果一个类很早以前
    //实现了某个接口，如果在将来的某天这个接口更新了，如果我们增加的是default方法，那么这个类就不需要再去实现这个方法。
    //默认方法优先级不会超过超类。类优先原则。如果是两个接口的默认方法冲突，就要指定。或者干脆直接重新定义

    public interface interface1{
       default void p1(){
            System.out.println(1);

        }
    }

    public interface interface2{
        default void p1(){
            System.out.println(2);
        }
    }

    public interface  interface3{
        void p1();
    }

    static class A implements interface1,interface2{
        @Override
        public void p1() {
            interface2.super.p1();
        }
    }

    static class B implements interface1,interface2{
        @Override
        public void p1() {
            interface1.super.p1();
        }
    }

    static class C implements interface1,interface3{
        @Override
        public void p1() {
            System.out.println(3);
        }
    }

    static class D{
        public void p1(){
            System.out.println(100);
        }
    }

    static class F extends D implements interface1{
        //自动忽略interface1中的方法。使用超类D中的p1方法。
    }
}
