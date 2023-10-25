package c4_factory.v4.Store;

import c4_factory.v4.Pizza.ChineseCheesePizza;
import c4_factory.v4.Pizza.ChineseGreekPizza;
import c4_factory.v4.Pizza.Pizza;

public class ChinesePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")){
            return new ChineseCheesePizza();
        }else if (type.equalsIgnoreCase("greek")){
            return new ChineseGreekPizza();
        }
        return null;
    }
}
