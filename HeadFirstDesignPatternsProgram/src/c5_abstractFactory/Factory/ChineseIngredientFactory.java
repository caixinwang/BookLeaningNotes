package c5_abstractFactory.Factory;

import c5_abstractFactory.Ingerdient.*;

import java.util.ArrayList;

public class ChineseIngredientFactory implements IngredientFactory{

    public Dough createDoug(){
        return new DoughA();
    }
    public Sauce createSauce(){
        return new SauceA();
    }
    public Calm createCalm(){
        return new CalmA();
    }
    public ArrayList<Topping> createToppings(){
        ArrayList<Topping> list=new ArrayList<>();
        list.add(new ToppingA1());
        list.add(new ToppingA2());
        return list;
    }

}
