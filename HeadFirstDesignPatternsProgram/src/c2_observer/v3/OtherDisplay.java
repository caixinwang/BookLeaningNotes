package c2_observer.v3;

public class OtherDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    //有引用不仅方便取消订阅，并且方便调用get方法
    private WeatherData weatherData;//has a 是一种低耦合

    public OtherDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);//默认向主题注册自己
    }
    @Override
    public void update() {//自己要几个数据就调用几个get方法
        temp= weatherData.getTemp();
        humidity= weatherData.getHumidity();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay"+temp+humidity);
    }
}
