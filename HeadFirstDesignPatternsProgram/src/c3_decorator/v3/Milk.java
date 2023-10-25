package c3_decorator.v3;
//配料是装饰者
public class Milk extends CondimentDecorator{
    private static final double milkCost=0.5;
    @Override
    public double cost() {
        return beverage.cost()+milkCost;
    }

    public Milk(Beverage beverage){
        this.beverage =beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",milk";
    }
}
