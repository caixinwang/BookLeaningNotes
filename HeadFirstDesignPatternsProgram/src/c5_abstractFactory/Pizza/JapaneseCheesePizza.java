package c5_abstractFactory.Pizza;


import c5_abstractFactory.Factory.ChineseIngredientFactory;
import c5_abstractFactory.Factory.IngredientFactory;
import c5_abstractFactory.Factory.JapaneseIngredientFactory;

public class JapaneseCheesePizza extends Pizza {

    IngredientFactory ingredientFactory;
    public JapaneseCheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    @Override
    public void prepare() {
        setName("JapaneseCheesePizza");
        setDough(ingredientFactory.createDoug());
        setSauce(ingredientFactory.createSauce());
    }

    public static void main(String[] args) {
        JapaneseCheesePizza chineseCheesePizza =new JapaneseCheesePizza(new JapaneseIngredientFactory());
        chineseCheesePizza.prepare();
    }
}
