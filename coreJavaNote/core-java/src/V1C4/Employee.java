package V1C4;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Employee implements Cloneable{//Cloneable是一个标记接口，这个接口里面没有指定的clone方法，clone从Object继承

    /**
     * 1.封装的优点：确保像name这样的只读字段一旦在构造其中设置，就没有任何方法可以对它进行修改，这样我们可以保证name字段不会收到外界
     * 的影响。虽然salary不是一个只读字段，但是它只能用raiseSalary这个方法进行修改。如果salary出现了错误我们只需要调试一个函数就行
     * 如果salary是公共的，那么破坏salary的语句可能在任何地方出现，这样就很难调试了
     * 2.如果一个字段只有访问器方法并且它是private的，那么他就是只读的。如果有修改器方法那么它就是可写的。
     */
    private String name;
    private double salary;
    private LocalDate hireDay;

    /**静态字段或者叫静态变量
     * 如果将一个字段定义为static，每个类只有一个这样的字段。所有的Employee对象共享同一个nextID字段，但是对于id字段每个Employee
     * 对象都有一个自己的id字段。
     */
    private static int nextId=1;//静态变量我们还是让它是private
    private int id;

    /**
     * 构造器总是连着new运算符来调用。
     */
    public Employee(String name, double salary,int year,int month,int day) {
        this.name=Objects.requireNonNull(name,"name can not be null");
//        this.name=Objects.requireNonNullElse(name,"name can not be null");
        this.salary = salary;
        this.hireDay=LocalDate.of(year,month,day);
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * 如果需要返回一个可变对象的引用，应该对它进行克隆。否则外部可以通过引用副本对对象的私有属性进行访问，破坏了封装性。
     * @return
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * 这里的方法设计为private是因为这个方法是对外的接口raiseSalary的辅助方法。
     * 只要方法是私有的，类的设计者就可以确信它不会用在别处，所以可以将其删去。如果一个方法是共有的，那么就不能简单的将其删去，
     * 因为可能会有别的代码依赖这个方法。
     *
     */
    private double help(double byPercent){//4.3.10
        return byPercent*salary/100 ;
    }

    public void raiseSalary(double byPercent){
        salary+=help(byPercent);
    }

    public void setId(){//利用nextId这个类字段进行id设置
        id=nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    /**
     * @return :利用类型转换可以直接返回Employee类型
     * @throws CloneNotSupportedException
     */
    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}

