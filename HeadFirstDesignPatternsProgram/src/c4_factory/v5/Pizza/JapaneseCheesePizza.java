package c4_factory.v5.Pizza;


public class JapaneseCheesePizza extends Pizza {
    public JapaneseCheesePizza(){
        super();
        name="Japanese Cheese Pizza";
        dough="20";
        sauce="pp";
    }

    public static void main(String[] args) {
        JapaneseCheesePizza chineseCheesePizza =new JapaneseCheesePizza();
        chineseCheesePizza.prepare();
    }
}
