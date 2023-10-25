package c3_decorator.v3;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;//这里不是private,而是默认的protected,这样子类可以使用
    @Override
    public abstract String getDescription();
}
