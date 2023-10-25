package c4_factory.v5.Store;


import c4_factory.v5.Factory.PizzaFactory;
import c4_factory.v5.Pizza.Pizza;

public class PizzaStore {
    private Pizza pizza;
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory){
        this.factory=factory;
    }

    public Pizza orderPizza(String type){
        pizza=factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    public static void main(String[] args) {

    }
}
