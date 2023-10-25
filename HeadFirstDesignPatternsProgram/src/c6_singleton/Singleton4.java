package c6_singleton;

public class Singleton4 {
    private volatile static Singleton4 singleton1;//需要加volatile

    private Singleton4(){}//私有

    public static Singleton4 getInstance(){
        if (singleton1 ==null){
            synchronized (Singleton4.class){//进入if了之后加锁再判断
                if (singleton1==null) singleton1 =new Singleton4();
            }
        }
        return singleton1;
    }
}
