package c3_decorator.v3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Milk(new Soy(new HouseBlend())).getDescription());
        System.out.println(new Milk(new Soy(new HouseBlend())).cost());
    }
}
