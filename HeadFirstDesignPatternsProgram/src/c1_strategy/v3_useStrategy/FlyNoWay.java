package c1_strategy.v3_useStrategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i cant not fly");
    }
}
