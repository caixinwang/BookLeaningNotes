package c5_abstractFactory.Factory;

import c5_abstractFactory.Ingerdient.Calm;
import c5_abstractFactory.Ingerdient.Dough;
import c5_abstractFactory.Ingerdient.Sauce;
import c5_abstractFactory.Ingerdient.Topping;

import java.util.ArrayList;
import java.util.List;

public interface IngredientFactory {

    public abstract Dough createDoug();
    public abstract Sauce createSauce();
    public abstract Calm createCalm();
    public abstract ArrayList<Topping> createToppings();

}
