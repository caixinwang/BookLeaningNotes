package V1C4;

public class Code4_6 {

    private int a;
    private boolean b;
    private String c;

    public Code4_6(){
        //无参构造器什么也没做，字段会被赋予默认值
    }

    @Override
    public String toString() {
        return "Code4_6{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }

    static class A{
        private static int nextId=1;
        //下面这两个赋值的操作都是在构造器运行之前执行的
        String name="";//直接赋值
        private int id=assignId();//初始化方法

        private int a;

        public A(){}
        public A(String name){
            this.name=name;
        }

        public A(String name,int a){
            this(name);//一定要放在第一句，否则报错：对this的调用必须是构造器中的第一个语句
            this.a=a;
        }

        public static int assignId(){
            int res=nextId++;
            return res;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", a=" + a +
                    '}';
        }
    }
    static class B{
        private int a=f2(c);
        private int b=3;
        private static int c=f1();//等价于这里直接赋值99
        private int d=100;//最终是d=c+200,因为按顺序来
        private static int e=99;//最终等于200，因为按顺序来
        private int f=f2(c);//最终等于300,因为按顺序来
        private int g;
        private int h=f2(c);

        public B(int a,int b,int g){
            this.a=a;
            this.b=b;
            this.g=g;
        }

        public B(){
            this(1,2,3);
            h=500;
        }

        {
            f=300;
        }

        {
            d=c+200;
        }
        static {
            e=200;
        }

        public static int f1(){
            return 99;
        }

        public static int f2(int x){
            return x+100;
        }

        @Override
        public String toString() {
            return "B{" +
                    "a=" + a +
                    ", b=" + b +
                    ", d=" + d +
                    ", f=" + f +
                    ", g=" + g +
                    ", h=" + h +
                    '}';
        }
    }

    public static void main(String[] args) {
        //4.6.1 重载
        /**
         * 可以看到下面的StringBuilder的构造器中有相同的名字，不同的参数。
         * 如果有多个方法（不仅限于构造器方法）有相同的名字、不同的参数便出现了重载
         * Java运允许重载任何方法，而不只是构造器方法。要完整的描述一个方法，需要指定方法名以及参数类型--这是方法的签名。
         * 返回类型不是方法签名的一部分，所以不能有签名相同，返回类型不同的函数。
         */
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder aasd = new StringBuilder("aasd");
        String fenGe="=============================";

        System.out.println("============4.6.2============");
        /**
         * 如果在构造器中没有显式的为字段设置初值，那么就会被自动地赋予初始值。0、false、null。最好不要依赖默认值因为对null的
         * 操作是危险的，可能会出现空指针异常。
         */
        Code4_6 o1=new Code4_6();
        System.out.println(o1);
        System.out.println(fenGe);

        System.out.println("============4.6.3============");
        /**
         * 在你创建一个类，但是没有为它提供构造器时，它会帮你提供一个什么都没做的无参构造器，这个无参构造器什么都没做，什么都没做
         * 意味着调用完之后我们得到的是默认值。什么都没做的无参构造器：public classname(){}
         * 但是你如果为类提供了至少一个构造器，但是没有提供无参数的构造器，那么此时你就不能使用无参构造器，这个系统提供给你的无参
         * 构造器在你给类提供构造器的时候就失效了。
         */
        System.out.println("============4.6.4 显式字段初始化============");
        /**
         * 观察A类
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(new A());
        }
        System.out.println("============4.6.5 参数名============");
        /**
         * 如果方法中的参数名和字段名重合，在方法中以参数名为主，如果需要用到字段名，需要加上this关键字
         */
        System.out.println("============4.6.6 调用另一个构造器============");
        /**
         * 观察A类中的构造器。构造器中的第一个语句形如this（...），这个构造器将调用同一个类的另一个构造器
         * 得出this的用法除了隐式参数，还有构造器
         */
        System.out.println(new A("jame",10));
        System.out.println("============4.6.7 初始化块============");
        /**
         * 调用构造器的具体处理步骤：具体观察B类
         *      1.如果有的话，先执行this();调用另一个构造器
         *      2.将没有初始值的字段赋予默认值。（在1.中如果有赋予的字段会跳过2、3步骤）
         *      3.按照在类中声明的顺序，执行初始化方法和初始化块。（注意：直接赋值属于初始化方法）
         *      4.执行构造器主体
         *具体细节：只执行另一个构造器的方法体。在方法体中操作过的字段不会进入2~3步骤。未操作过的字段进入2~3步骤。
         * 静态变量在类第一次加载的时候就初始化完毕了，也是按照顺序进行。
         */
        System.out.println(new B());


    }
}
