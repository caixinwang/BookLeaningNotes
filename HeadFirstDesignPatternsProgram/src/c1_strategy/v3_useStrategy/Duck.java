package c1_strategy.v3_useStrategy;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();
    public void swim(){
        System.out.println("swim...");
    }
    public void quack(){
        quackBehavior.quack();
    }
    public void fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
