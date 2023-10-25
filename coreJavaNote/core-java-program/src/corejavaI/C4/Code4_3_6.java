package corejavaI.C4;

public class Code4_3_6 {

    public static void main(String[] args) {
        /**
         * 不能对null使用方法，会报错。定义一个类时，最好知道哪些变量可能为null，在我们的Employee中只有
         * hireDay和name是一个对象，因为hireDay我们使用LocalDate.of()使用不可能是null。我们只需要担心
         * name即可。有两种处理方法：1.把null参数转化为一个适当的非null值。2.Java9中Object类提供了一个方法
         * requireNonNullElse和requireNonNull，前者是宽容性，后者是严格性也就是直接拒绝null参数
         * 如果要接受一个对象引用作为构造器参数，如果这个值不是可有可无的就使用严格型的方法。
         * 严格型直接报错也是有好处的，异常报告会提出这个问题的描述，并且会准确的指出问题所在的位置，否则
         * 空指针异常可能会在别的地方出现这样的话就追踪不到真正导致问题的这个构造器参数。
         */
        Employee employee1=new Employee("jame",2002,2002,7,28);
        //在Employee类中的构造器使用宽容性就不会报错，使用严格型会报错
        Employee employee2=new Employee(null,2002,2002,7,28);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }


}
