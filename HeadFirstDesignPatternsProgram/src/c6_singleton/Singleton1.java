package c6_singleton;

public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1(){}//私有

    public static Singleton1 getInstance(){
        if (singleton1 ==null){
            singleton1 =new Singleton1();
        }
        return singleton1;
    }
}
