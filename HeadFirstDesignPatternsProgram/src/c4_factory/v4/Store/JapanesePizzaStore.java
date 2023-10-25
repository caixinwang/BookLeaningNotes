package c4_factory.v4.Store;

import c4_factory.v4.Pizza.JapaneseCheesePizza;
import c4_factory.v4.Pizza.JapaneseGreekPizza;
import c4_factory.v4.Pizza.Pizza;

public class JapanesePizzaStore extends PizzaStore{
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
