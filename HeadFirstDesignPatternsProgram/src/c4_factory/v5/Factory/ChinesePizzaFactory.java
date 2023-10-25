package c4_factory.v5.Factory;

import c4_factory.v5.Pizza.ChineseCheesePizza;
import c4_factory.v5.Pizza.ChineseGreekPizza;
import c4_factory.v5.Pizza.Pizza;

public class ChinesePizzaFactory extends PizzaFactory{
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
