package c4_factory.v2;


public class SimpleFactory {

    public static Pizza createPizza(String type){
        if (type.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }else if (type.equalsIgnoreCase("greek")){
            return new GreekPizza();
        }
        return null;
    }

}
