package c6_singleton;

public class Singleton3 {//使用同步，暴力解决
    private static Singleton3 singleton1=new Singleton3();

    private Singleton3(){}//私有

    public synchronized static Singleton3 getInstance(){
        return singleton1;
    }
}
