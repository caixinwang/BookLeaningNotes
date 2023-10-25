package c4_factory.v4.Pizza;


public class ChineseGreekPizza extends Pizza {
    public ChineseGreekPizza(){
        super();
        name="Chinese Greek Pizza";
        dough="10";
        sauce="ox";
    }

    public static void main(String[] args) {
        ChineseGreekPizza chineseGreekPizza =new ChineseGreekPizza();
        chineseGreekPizza.prepare();
    }
}
