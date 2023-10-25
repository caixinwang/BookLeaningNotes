package c4_factory.v5.Factory;

import c4_factory.v5.Pizza.JapaneseCheesePizza;
import c4_factory.v5.Pizza.JapaneseGreekPizza;
import c4_factory.v5.Pizza.Pizza;

public class JapanesePizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")){
            return new JapaneseCheesePizza();
        }else if (type.equalsIgnoreCase("greek")){
            return new JapaneseGreekPizza();
        }
        return null;
    }
}
