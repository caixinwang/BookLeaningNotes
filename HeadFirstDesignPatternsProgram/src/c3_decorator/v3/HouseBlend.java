package c3_decorator.v3;
//具体的饮品
public class HouseBlend extends Beverage {//被装饰者
    private static final double houseBlendCost=2.0;

    public HouseBlend() {
        description="HouseBlend";
    }

    @Override
    public double cost() {
        return  houseBlendCost;
    }

}
