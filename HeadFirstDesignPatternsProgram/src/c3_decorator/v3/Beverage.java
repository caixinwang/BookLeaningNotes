package c3_decorator.v3;

public abstract class Beverage {
    String description="unknown beverage";

    public String getDescription() {
        return description;
    }
    //子类要自己实现价格
    public abstract double cost();
}
