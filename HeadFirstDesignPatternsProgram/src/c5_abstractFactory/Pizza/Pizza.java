package c5_abstractFactory.Pizza;

import c5_abstractFactory.Ingerdient.Calm;
import c5_abstractFactory.Ingerdient.Dough;
import c5_abstractFactory.Ingerdient.Sauce;
import c5_abstractFactory.Ingerdient.Topping;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;//生面团
    Sauce sauce;//酱汁
    Calm calm;//蛤蜊--新需求
    List<Topping> toppings = new ArrayList<>();//配料

    public Pizza() {
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setCalm(Calm calm) {
        this.calm = calm;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

}
