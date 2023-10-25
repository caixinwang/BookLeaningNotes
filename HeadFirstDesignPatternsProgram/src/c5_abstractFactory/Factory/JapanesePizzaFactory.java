package c5_abstractFactory.Factory;

import c5_abstractFactory.Pizza.*;

public class JapanesePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        IngredientFactory ingredientFactory=new JapaneseIngredientFactory();
        if (type.equalsIgnoreCase("cheese")){
            return new JapaneseCheesePizza(ingredientFactory);
        }else if (type.equalsIgnoreCase("greek")){
            return new JapaneseGreekPizza(ingredientFactory);
        }
        return null;
    }
}
