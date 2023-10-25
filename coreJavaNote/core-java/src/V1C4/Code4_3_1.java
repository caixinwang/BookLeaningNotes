package V1C4;

import java.time.LocalDate;

public class Code4_3_1 {//4.3--用户自定义类  4.3.1
    /**
     * 在java中最简单的类定义形式：
     *  field1
     *  field2
     *  ...
     *  constructor1
     *  constructor2
     *  ...
     *  method1
     *  method2
     *  ...
     */
    //示范。这里的类的方法都被标记为public，代表着任何类的任何方法都可以调用这些方法。
    //字段为private代表着只有Employee类自身的方法可以访问，其他类的方法不能读写这些字段
    static class Employee{//static是为了能够使外面的类可以使用Employee
        private String name;
        private double salary;
        private LocalDate hireDay;

        /**
         * 构造器总是连着new运算符来调用。
         */
        public Employee(String name, double salary,int year,int month,int day) {
            this.name = name;
            this.salary = salary;
            this.hireDay=LocalDate.of(year,month,day);
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public void raiseSalary(double byPercent){
            salary+=salary*byPercent/100;
        }
    }




}
