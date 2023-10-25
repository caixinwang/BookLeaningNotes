package c1_strategy.v3_useStrategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyWithWings");
    }
}
