package c4_factory.v5.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;//生面团
    protected String sauce;//酱汁
    protected List<String> toppings=new ArrayList<>();//配料

    public Pizza(){
        name="default";
        dough="default";
        sauce="default";
    }

    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough..."+dough);
        System.out.println("Adding sauce..."+sauce);
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("  "+topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
