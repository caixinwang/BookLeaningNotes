package c5_abstractFactory.Factory;


import c5_abstractFactory.Pizza.ChineseCheesePizza;
import c5_abstractFactory.Pizza.ChineseGreekPizza;
import c5_abstractFactory.Pizza.Pizza;

public class ChinesePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        IngredientFactory ingredientFactory=new ChineseIngredientFactory();
        if (type.equalsIgnoreCase("cheese")){
            return new ChineseCheesePizza(ingredientFactory);
        }else if (type.equalsIgnoreCase("greek")){
            return new ChineseGreekPizza(ingredientFactory);
        }
        return null;
    }
}
