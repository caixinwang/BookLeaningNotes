package c2_observer.v1;

public class WeatherData {
    private float temp;
    private float humidity;
    private float pressure;

    public void measurementsChanged(){
        currentConditionDisplay(temp,humidity,pressure);
        statisticsDisplay(temp,humidity,pressure);
        forecastDisplay(temp,humidity,pressure);
    }
    public void currentConditionDisplay(float temp,float humidity,float pressure){
        System.out.println("currentConditionDisplay");
    }
    public void statisticsDisplay(float temp,float humidity,float pressure){
        System.out.println("statisticsDisplay");
    }
    public void forecastDisplay(float temp,float humidity,float pressure){
        System.out.println("forecastDisplay");
    }
}
