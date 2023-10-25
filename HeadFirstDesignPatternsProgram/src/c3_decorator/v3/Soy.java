package c3_decorator.v3;

public class Soy extends CondimentDecorator {
    private static final double soyCost = 0.7;

    public Soy(Beverage b) {
        beverage = b;
    }

    @Override
    public double cost() {
        return beverage.cost() + soyCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",soy";

    }
}
