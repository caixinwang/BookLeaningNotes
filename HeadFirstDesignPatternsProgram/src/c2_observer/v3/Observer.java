package c2_observer.v3;

public interface Observer {
    //不传入任何的参数。即主题不主动传递数据给观察者，观察者要获取数据自己调用get方法
    void update();
}
