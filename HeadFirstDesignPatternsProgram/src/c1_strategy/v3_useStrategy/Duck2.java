package c1_strategy.v3_useStrategy;

public class Duck2 extends Duck{
    public Duck2(){
        //默认不会飞也不会叫，有需要就自己设置
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new QuackNoWay());
    }
    @Override
    public void display() {
        System.out.println("i am duck2");
    }
}
