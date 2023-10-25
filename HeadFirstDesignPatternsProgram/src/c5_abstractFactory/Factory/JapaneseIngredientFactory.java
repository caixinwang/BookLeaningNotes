package c5_abstractFactory.Factory;

import c5_abstractFactory.Ingerdient.*;

import java.util.ArrayList;

public class JapaneseIngredientFactory implements IngredientFactory{
    public Dough createDoug(){
        return new DoughB();
    }
    public Sauce createSauce(){
        return new SauceB();
    }
    public Calm createCalm(){
        return new CalmB();
    }
    public ArrayList<Topping> createToppings(){
        ArrayList<Topping> list=new ArrayList<>();
        list.add(new ToppingB1());
        list.add(new ToppingB2());
        return list;
    }

}
