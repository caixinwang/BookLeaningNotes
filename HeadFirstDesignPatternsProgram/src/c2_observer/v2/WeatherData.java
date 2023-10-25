package c2_observer.v2;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Subject{
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData(){
        //temp humidity pressure 系统会初始化为0
        observers=new LinkedList<Observer>();
    }

    public void measurementsChanged(){//当数据有改变就调用这个方法
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {//通知每一个观察者
            observer.update(temp,humidity,pressure);//不管订阅者要不要全部的数据，全部塞进去
        }
    }
}
