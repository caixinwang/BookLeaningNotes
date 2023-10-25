package c4_factory.v1;

public class PizzaStore {
    private Pizza pizza;

    public Pizza orderPizza(String type){
        if (type.equalsIgnoreCase("cheese")){
            pizza= new CheesePizza();
        }else if (type.equalsIgnoreCase("greek")){
            pizza= new GreekPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
        return pizza;
    }
}
