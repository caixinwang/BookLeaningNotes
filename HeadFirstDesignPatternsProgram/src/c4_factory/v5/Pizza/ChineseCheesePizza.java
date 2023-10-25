package c4_factory.v5.Pizza;


public class ChineseCheesePizza extends Pizza {
    public ChineseCheesePizza(){
        super();
        name="Cheese Cheese Pizza";
        dough="10";
        sauce="ox";
        toppings.add("辣椒");
    }

    public static void main(String[] args) {
        ChineseCheesePizza chineseCheesePizza =new ChineseCheesePizza();
        chineseCheesePizza.prepare();
    }
}
