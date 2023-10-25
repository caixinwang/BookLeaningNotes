package c5_abstractFactory.Pizza;


import c5_abstractFactory.Factory.ChineseIngredientFactory;
import c5_abstractFactory.Factory.IngredientFactory;

public class ChineseGreekPizza extends Pizza {
    IngredientFactory ingredientFactory;
    public ChineseGreekPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("ChineseGreekPizza");
        setDough(ingredientFactory.createDoug());
        setSauce(ingredientFactory.createSauce());
        setCalm(ingredientFactory.createCalm());
    }

    public static void main(String[] args) {
        ChineseGreekPizza chineseGreekPizza =new ChineseGreekPizza(new ChineseIngredientFactory());
        chineseGreekPizza.prepare();
    }
}
