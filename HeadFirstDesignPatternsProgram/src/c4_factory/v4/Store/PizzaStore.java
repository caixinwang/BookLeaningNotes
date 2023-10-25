package c4_factory.v4.Store;


import c4_factory.v4.Pizza.Pizza;

public abstract class PizzaStore {
    private Pizza pizza;

    public Pizza orderPizza(String type){
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

    public static void main(String[] args) {

    }
}
