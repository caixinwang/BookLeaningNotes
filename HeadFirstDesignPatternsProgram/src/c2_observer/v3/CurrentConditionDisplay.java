package c2_observer.v3;

import c2_observer.v3.WeatherData;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    //有引用不仅方便取消订阅，并且方便调用get方法
    private WeatherData weatherData;//has a 是一种低耦合

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);//默认向主题注册自己
    }
    @Override
    public void update() {
        temp= weatherData.getTemp();
        humidity= weatherData.getHumidity();
        pressure=weatherData.getPressure();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay"+temp+humidity+pressure);
    }
}
