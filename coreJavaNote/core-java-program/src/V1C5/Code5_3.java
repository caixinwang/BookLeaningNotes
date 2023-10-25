package V1C5;

import java.util.ArrayList;

public class Code5_3 {//泛型数组列表ArrayList
    static class A{
        private int a;
        private String name;

        public A(int a, String name) {
            this.a = a;
            this.name = name;
        }

        @Override
        public String toString() {
            return "A{" +
                    "a=" + a +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        //用var不能使用菱形语法，var as=new ArrayList<>()会默认是Object类型的
        ArrayList<A> as = new ArrayList<>(20);//可以设置初始大小也可以不设置
        as.ensureCapacity(15);//还可以修改大小,但是到大于实际大小
        as.add(new A(1,"1"));//利用add来添加元素
        as.trimToSize();//如果确认数组能够保持恒定就把内部数组空间减小到实际的数组空间。例如此时空间就是1了
        as.add(new A(2,"2"));//trim之后依然可以增加元素，只不过内部会帮我们扩充数组
        A a1 = as.set(1, new A(3, "3"));//只能set 0~1下标实际有元素的位置。其它地方可能内部数组有空位，但是不给你用
//        as.set(3,new A(4,"4"));//报错
        A a=as.get(0);//通过下标获取元素
        as.add(1,new A(4,"4"));//在1位置插入一个新元素，1位置以后的所有元素往后移一个位置，列表大小+1
        as.remove(0);//将0位置的元素移出，0位置以后全部往前挪一个，列表大小-1
        int size = as.size();//通过size()来访问大小
        for (A a2 : as) {
            System.out.println(a2);
        }

    }
}
