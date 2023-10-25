package c2_observer.v2;

public interface Observer {
    //这种传入所有参数的实现方法比较僵硬，不管观察者要不要，统一把全部的数据给了
    void update(float temp,float humidity,float pressure);
}
