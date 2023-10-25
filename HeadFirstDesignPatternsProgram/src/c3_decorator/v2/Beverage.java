package c3_decorator.v2;

public abstract class Beverage {
    private static final double milkCost=0.5;
    private static final double soyCost=0.6;
    private static final double mochaCost=0.7;
    private static final double whipCost=0.8;
    private String description;
    private boolean hasMilk;
    private boolean hasSoy;
    private boolean hasMocha;
    private boolean hasWhip;

    public String getDescription() {
        return "";
    }
    //子类从父类获取配料的价格
    public double cost(){
        int res=0;
        res+=hasMilk?milkCost:0;
        res+=hasSoy?soyCost:0;
        res+=hasMocha?mochaCost:0;
        res+=hasWhip?whipCost:0;
        return res;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public boolean isHasSoy() {
        return hasSoy;
    }

    public void setHasSoy(boolean hasSoy) {
        this.hasSoy = hasSoy;
    }

    public boolean isHasMocha() {
        return hasMocha;
    }

    public void setHasMocha(boolean hasMocha) {
        this.hasMocha = hasMocha;
    }

    public boolean isHasWhip() {
        return hasWhip;
    }

    public void setHasWhip(boolean hasWhip) {
        this.hasWhip = hasWhip;
    }
}