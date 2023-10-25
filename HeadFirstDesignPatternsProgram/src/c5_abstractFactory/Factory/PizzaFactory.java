package c5_abstractFactory.Factory;


import c5_abstractFactory.Pizza.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);
}
