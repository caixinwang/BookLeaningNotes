package c3_decorator.v3;

public class Mocha extends CondimentDecorator{
    private static final double mochaCost=0.6;
    public Mocha(Beverage b){
        beverage =b;
    }
    @Override
    public double cost() {
        return beverage.cost()+mochaCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",mocha";
    }
}
