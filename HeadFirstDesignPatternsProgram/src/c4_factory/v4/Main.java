package c4_factory.v4;

import c4_factory.v4.Store.ChinesePizzaStore;
import c4_factory.v4.Store.JapanesePizzaStore;
import c4_factory.v4.Store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore1=new ChinesePizzaStore();
        PizzaStore pizzaStore2=new JapanesePizzaStore();

        pizzaStore1.orderPizza("cheese");
        System.out.println("====================");
        pizzaStore2.orderPizza("greek");
    }
}
