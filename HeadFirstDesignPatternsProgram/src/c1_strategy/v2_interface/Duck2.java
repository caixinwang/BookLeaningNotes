package c1_strategy.v2_interface;

public class Duck2 extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("i am duck2");
    }

    @Override
    public void fly() {
        System.out.println("duck2 fly");
    }

    @Override
    public void quack() {
        System.out.println("duck2 quack");

    }
}
