package corejavaI.C4;

public class Code4_3_11 {
    private final String name;

    public Code4_3_11(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        /**
         * 一定要确保构造器运行之后name字段已经被初始化，并且初始化之后就不能被改变了。构造器没有初始化name字段或者是企图改变
         * name字段都会报错。final修饰基本类型或者是不可变类是有用的。如果修饰其它的类只能保证这个变量不会引用别的对象，不能
         * 保证这个变量不会修改它引用的对象
         */
        Code4_3_11 a = new Code4_3_11("a");

    }
}
