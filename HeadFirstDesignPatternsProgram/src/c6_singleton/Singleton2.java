package c6_singleton;

public class Singleton2 {//使用同步，暴力解决
    private static Singleton2 singleton1;

    private Singleton2(){}//私有

    public synchronized static Singleton2 getInstance(){
        if (singleton1 ==null){
            singleton1 =new Singleton2();
        }
        return singleton1;
    }
}
