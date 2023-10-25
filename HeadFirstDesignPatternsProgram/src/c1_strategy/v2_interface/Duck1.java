package c1_strategy.v2_interface;

public class Duck1 extends Duck implements Flyable{
    @Override
    public void display() {
        System.out.println("i am duck1");
    }

    @Override
    public void fly() {
        System.out.println("duck1 fly");
    }
}
