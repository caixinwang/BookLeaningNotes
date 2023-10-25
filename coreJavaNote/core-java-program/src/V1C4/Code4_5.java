package V1C4;

public class Code4_5 {

    public static void swap(int a,int b){
        int tmp = a;
        a=b;
        b=tmp;
    }

    public static void swap(Employee a,Employee b){
        Employee tmp = a;
        a=b;
        b=tmp;
    }

    public static Employee f(Employee a){
        a.raiseSalary(100);
        return a;
    }

    public static void main(String[] args) {
        /**
         * java是按值传递
         * java中对方法参数不能修改基本数据类型的参数，也就是传入方法中的a，b不会受到影响。
         * 可以改变对象参数状态
         * 不能改变对象参数的引用
         */
        int a=1;
        int b=2;
        swap(a,b);//失败的
        System.out.println(a+" "+b);
        Employee employee = new Employee("jame", 100, 1, 1, 1);
        Employee employee1 = new Employee("Bob", 2, 2, 2, 2);
        swap(employee,employee1);//失败
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(f(employee));;//成功

    }
}
