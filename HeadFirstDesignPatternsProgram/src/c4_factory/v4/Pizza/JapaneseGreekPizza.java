package c4_factory.v4.Pizza;


public class JapaneseGreekPizza extends Pizza {
    public JapaneseGreekPizza(){
        super();
        name="Japanese Greek Pizza";
        dough="20";
        sauce="pp";
        toppings.add("番茄");
    }

    public static void main(String[] args) {
        JapaneseGreekPizza chineseGreekPizza =new JapaneseGreekPizza();
        chineseGreekPizza.prepare();
    }
}
