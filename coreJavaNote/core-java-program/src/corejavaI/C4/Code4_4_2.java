package corejavaI.C4;

public class Code4_4_2 {//静态常量
    /**
     * 如果忽略static那PI就是就变成类的实例字段，每一个对象都有一个PI的副本。并且需要通过一个具体的对象才能访问到PI
     * 我们使用的System.out，其中out就是System类中的一个打印流类的静态常量。如果out不是static，那么我们就需要创建一个具体的
     * System对象才能访问到里面的out
     */
    private static final double PI=3.1415926;
    private final double GENHAO2=1.414;
    public static void main(String[] args) {
        System.out.println(Code4_4_2.PI);
//        System.out.println(Code4_4_2.GENHAO2);//会报错，因为GENHAO2不是静态的，不能直接通过类名获取
        System.out.println(new Code4_4_2().GENHAO2);//需要创建一个具体对象才能访问GENHAO2
        //因为是常量，所以不允许被重新赋值
//        PI=2;

    }
}
