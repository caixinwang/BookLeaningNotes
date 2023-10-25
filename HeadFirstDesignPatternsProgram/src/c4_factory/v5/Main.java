package c4_factory.v5;


import c4_factory.v5.Factory.ChinesePizzaFactory;
import c4_factory.v5.Factory.JapanesePizzaFactory;
import c4_factory.v5.Store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore ChinesePizzaStore = new PizzaStore(new ChinesePizzaFactory());
        PizzaStore JapanesePizzaStore = new PizzaStore(new JapanesePizzaFactory());

        ChinesePizzaStore.orderPizza("cheese");
        System.out.println("====================");
        JapanesePizzaStore.orderPizza("cheese");
    }
}
