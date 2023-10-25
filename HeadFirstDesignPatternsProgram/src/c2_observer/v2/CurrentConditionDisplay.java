package c2_observer.v2;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    //这几个是这种显示要从主题获取的数据
    private float temp;
    private float humidity;
    private float pressure;
    //有对主题的引用可以方便以后取消订阅
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);//默认向主题注册自己
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay:"+temp+humidity+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
    }
}
