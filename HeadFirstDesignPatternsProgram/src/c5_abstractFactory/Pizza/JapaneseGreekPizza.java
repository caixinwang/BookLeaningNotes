package c5_abstractFactory.Pizza;


import c5_abstractFactory.Factory.IngredientFactory;
import c5_abstractFactory.Factory.JapaneseIngredientFactory;

public class JapaneseGreekPizza extends Pizza {
    IngredientFactory ingredientFactory;

    public JapaneseGreekPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("JapaneseGreekPizza");
        setDough(ingredientFactory.createDoug());
        setSauce(ingredientFactory.createSauce());
        setCalm(ingredientFactory.createCalm());

    }

    public static void main(String[] args) {
        JapaneseGreekPizza chineseGreekPizza = new JapaneseGreekPizza(new JapaneseIngredientFactory());
        chineseGreekPizza.prepare();
    }
}
