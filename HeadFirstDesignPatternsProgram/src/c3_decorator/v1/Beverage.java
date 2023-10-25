package c3_decorator.v1;

public abstract class Beverage {
    private String description;

    public String getDescription() {
        return "";
    }
    //子类要自己实现价格
    public abstract double cost();
}
