package c3_decorator.v2;

public class HouseBlend extends Beverage {
    private static final double houseBlendCost=2.0;
    @Override
    public double cost() {
        return  houseBlendCost+super.cost();
    }

    public HouseBlend() {//有加配料自己去对应的业务里面set
        super();
    }

    @Override
    public String getDescription() {
        String res="HouseBlend";
        res+=isHasMilk()?",milk":"";
        res+=isHasMocha()?",Mocha":"";
        res+=isHasSoy()?",soy":"";
        res+=isHasWhip()?",whip":"";
        return res;
    }
}
