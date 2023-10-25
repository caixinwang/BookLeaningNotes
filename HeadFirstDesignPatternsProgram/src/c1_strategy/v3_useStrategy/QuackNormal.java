package c1_strategy.v3_useStrategy;

public class QuackNormal implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
