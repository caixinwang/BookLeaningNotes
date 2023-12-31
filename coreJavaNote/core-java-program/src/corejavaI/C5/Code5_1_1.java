package corejavaI.C5;

public class Code5_1_1 {//5.1.1定义子类/5.1.2覆盖方法/5.1.3子类构造器/5.1.5多态


    static class A {
        private int a;
        private int b;

        private int f(){
            return -1;
        }

        public int f1(){
            return a+b;
        }

        public static int f2(){
            return 5;
        }

        public A(int a,int b){
            this.a=a;
            this.b=b;
        }

        public A(){}//超类中如果没有无参构造器，子类中又不显示调用超类的其它构造器，就会报错

    }

    /**
     * B类自动继承了A类的public方法，也继承了A类的字段。但是B类不能直接访问这些继承的字段，访问这些字段需要使用继承的方法。
     * 定义子类的时候只需要指出子类与超类的不同之处。在设计类的时候应该把更一般的方法放在超类，把更特殊的方法放在子类中
     */
    static class B extends A{
        private int c;

        public B(int a,int b,int c){//super关键字可以用来调用超类的构造器和方法。同this一样，调用构造器只能在第一句
            super(a,b);//这里不能写成this.a=a;this.b=b。因为超类不能直接访问继承来的私有字段，需要使用方法
            this.c=c;
        }

//        public static int f2(){
//            return 6;
//        }

        @Override
        public int f1() {
            /**
             * 1.不能写成this.a+this,b+this.c；也不能写成f1()+this.c，因为这个f1默认代表的是当前超类的f1方法，会进入
             * 无限递归。如果要想表示调用子类的方法，需要使用super关键字。
             * 2.super关键字：与this不同，this可以代表隐式参数，是可以代表一个对象引用的。但是super只是一个表示调用超类方法的关键字
             * 3.在子类中可以增加字段，增加方法或者覆盖超类方法，不过绝对不会删除任何字段和方法
             * 4.子类中如果没有显示的电泳超类的构造器，将自动地用超类的无参数构造器，如果超类没有无参数的构造器，并且在子类
             * 的构造器中没有显示调用超类的其他的构造器，就会报错
             */
            return super.f1()+this.c;
        }
    }

    public static void main(String[] args) {
        /**
         * 从输出中可以看到，尽管我这里的数组类型是A，但是当我们将它的子类赋予数组里面也是可以的。虚拟机知道知道as[2]实际
         * 引用的对象类型，因此能够正确的调用相应的方法。
         * 一个对象引用变量e声明为A类型，它既可以引用A类型的对象，也可以引用A类型的子类B。
         * 一个对象变量e可以指示多种实际类型的现象称之为多态。在运行时能正确选择适当的方法，称为动态绑定。
         */
        A[] as = new A[3];
        as[0]=new A(1,2);
        as[1]=new A(2,3);
        as[2]=new B(1,2,3);
        for (int i = 0; i < as.length; i++) {
            System.out.println(as[i].f1());
        }

        System.out.println("==========================");
        /**
         * 对象变量e（A类型）是多态的，可以引用A也可以引用B。下面b和a变量引用的是同一个对象，但是编译器不同于虚拟机，它比较笨，也就是
         * 说如果用a变量来调用b的新增的方法是会报错的。但是如果调用重载的方法就可以通过，然后交给聪明的虚拟机去执行正确的代码。
         */
        B b=new B(1,2,3);
        A a=b;

        /**
         * 在java中，子类引用的数组可以转换成超类引用的数组，不需要进行强制类型转换。但是这样会出现问题,转换之后我们就能往原本是B类型
         * 对象数组中添加A对象了。这样我再调用bs[0].f1，会访问其实不存在的c字段，搅乱相邻的存储空间。为了防止这样的事情发生，所有数组
         * 都要牢记创建时元素的类型，并负责仅将类型兼容的引用存储到数组中。否则抛出异常ArrayStoreException。
         */
        B[] bs = new B[3];
        bs[0]=new B(1,2,3);
        bs[1]=new B(2,3,4);
        bs[2]=new B(3,4,5);
        A[] as1=bs;//合法
//        as1[0]=new A(1,2);//报错！因为利用as1偷换了bs[0]，使它变成了A类型。
//        System.out.println(bs[0].f1());
        System.out.println("==========================");//方法的调用
        /**
         * 1.下面说明了为什么static会是静态绑定，因为如果B类型自己有f2方法，那么它会直接调用B类自己的f2方法。如果B类没有自己的f2
         * 方法，才会去找A的f2方法。因为static是通过声明类型来进行查找的，所以是静态绑定，不管实际类型是什么。
         *
         */
        A a1=new A(1,2);
        A a2=new B(1,2,3);
        B b1=new B(2,3,4);
        System.out.println(a1.f2());
        System.out.println(a2.f2());//这里因为a2声明为A类型，尽管实际类型为B类型，但是因为是static会根据声明类型直接调用A中的f2
        System.out.println(b1.f2());//声明类型为B，因为B中没有f2方法，所以会调用A的f2方法。如果B自己有f2，那么就会调用自己的
        /**
         * 2.因为在覆盖一个方法的时候，子类方法不能低于超类方法的可见性。并且由于重载解析是从声明类型开始的。如果从当前的声明类开始
         * 就找到匹配的private或者final的方法签名，就说明后续不可能会有重载这个方法的子类了。并且此时也不需要考虑超类，因为private
         * 和final一定是声明类独有的，也就是说查找不到超类的private方法和final方法，找的到的就是自己的，所以可以使用静态绑定
         */
        System.out.println(as[2].f());//注意这里调用了父类A的私有方法f，as[2]的实际类型是B
        B b3=new B(1,2,3);
//        System.out.println(b3.f());//报错
        /**
         * 1.开始编译器通过变量x的声明类型类C,寻找C和C的超类中与签名匹配的方法f(超类中私有的和final的方法找不了),确定方法签名存在。
         * 2.如果找到了的方法是private或者是final的或者是static那么直接知道调用当前声明类的方法，此为静态绑定--不依赖x的实际类型
         * 3.如果依赖于x的实际类型那么说明需要启动动态绑定。如果x的实际类型是C的子类D，那么虚拟机会从D的方法表中寻找是否D有定义方法f
         * 如果有就调用D类中定义的这个方法，否则就在D的超类中继续寻找，以此类推。最后虚拟机调用找到的方法。
         */

    }
}
