package c4_factory.v2;

public class PizzaStore {
    private Pizza pizza;

    public Pizza orderPizza(String type){
        pizza=SimpleFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore=new PizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
