package c4_factory.v3;

public class PizzaStore {
    private Pizza pizza;

    public Pizza orderPizza(String type){
        pizza= createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public Pizza createPizza(String type){
        if (type.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }else if (type.equalsIgnoreCase("greek")){
            return new GreekPizza();
        }
        return null;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore=new PizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
