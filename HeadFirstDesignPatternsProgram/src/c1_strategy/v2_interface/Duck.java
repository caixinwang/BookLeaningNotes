package c1_strategy.v2_interface;

/**
 * 并不是所有的鸭子都会叫和飞，所以制作成了接口。
 * 这样一来就会像继承一样，在父类中添加方法，所以子类都要实现一遍了。但是也引入了新问题
 * 假如所有的fly的实现中不能使用标准输出，那么我们是不是就得把所有实现了fly的类全部找出来逐一修改？
 */
public abstract class Duck {
    public void swim(){
        System.out.println("swim...");
    }
    public abstract void display();//每种鸭子都有自己的外观
}
