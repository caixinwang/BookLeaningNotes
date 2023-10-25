package c2_observer.v2;

public class OtherDisplay implements Observer,DisplayElement{
    //只要这两种数据
    private float temp;
    private float humidity;
    //有对主题的引用可以方便以后取消订阅
    private WeatherData weatherData;

    public OtherDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);//默认向主题注册自己
    }

    @Override
    public void display() {
        System.out.println("OtherDisplay"+temp+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
    }
}
