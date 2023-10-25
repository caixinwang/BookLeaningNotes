package c4_factory.v5.Factory;


import c4_factory.v5.Pizza.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);
}
