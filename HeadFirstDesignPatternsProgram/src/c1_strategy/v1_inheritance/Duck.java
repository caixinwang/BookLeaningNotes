package c1_strategy.v1_inheritance;

public abstract class Duck {

    public void quack(){
        System.out.println("嘎嘎嘎");
    }

    public void swim(){
        System.out.println("swim......");
    }

    public abstract void display();//所有鸭子的外观不一样,具体在子类实现

//    public abstract void fly();//如果要给鸭子加个飞行的功能，意味着所有的子类都要实现这个方法，但是子类并不都是能飞的鸭子

}
