package corejavaI.C4;

public class Code4_3_7 {

    private  int num;

    public static void main(String[] args) {
        /**
         * 隐式参数和显式参数
         */
        Employee employee=new Employee("jame",2002,2002,7,28);
        employee.raiseSalary(5);//这里的employee就是隐式参数，raise方法是对employee对象进行操作。显式参数就是5
        Code4_3_7 x = new Code4_3_7();//此时构造器里面的this就是代表x，也就是x.num=1;
    }

    public Code4_3_7(){//传进来的显示参数名和字段不一样就可以直接使用num，此时默认就是有this的。
//        this.num=1;//这里的this就是代指隐式参数
        num=1;//这里底层也是this.num=1
    }

    public Code4_3_7(int num){//如果显示参数传进来的参数名和字段名相同，那么就需要用this关键词区分显示参数和隐式参数
        this.num=num;
    }

}
