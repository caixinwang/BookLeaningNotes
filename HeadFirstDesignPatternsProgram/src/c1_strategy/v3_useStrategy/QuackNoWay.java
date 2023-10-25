package c1_strategy.v3_useStrategy;

public class QuackNoWay implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("i cant not quack");
    }
}
