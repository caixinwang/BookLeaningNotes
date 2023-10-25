package V1C4;

import java.util.Objects;

public class Code4_3_9 {

    private String name;

    public Code4_3_9(String name){
        this.name=name;
    }

    //这里隐式参数对象对o对象的私有数据name也进行了访问
    public boolean equals(Code4_3_9 o) {
        return name.equals(o.name);
    }

    public static void main(String[] args) {
        /**
         * 基于类的访问权限
         */

        //一个方法可以访问所属类的所有对象的私有数据
        Code4_3_9 a=new Code4_3_9("a");
        Code4_3_9 b=new Code4_3_9("b");
        a.equals(b);
    }



}
