package c5_abstractFactory.Pizza;


import c5_abstractFactory.Factory.ChineseIngredientFactory;
import c5_abstractFactory.Factory.IngredientFactory;

public class ChineseCheesePizza extends Pizza {
    IngredientFactory ingredientFactory;
    public ChineseCheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("ChineseCheesePizza");
        setDough(ingredientFactory.createDoug());
        setSauce(ingredientFactory.createSauce());
    }

    public static void main(String[] args) {
        ChineseCheesePizza chineseCheesePizza =new ChineseCheesePizza(new ChineseIngredientFactory());
        chineseCheesePizza.prepare();
    }
}
