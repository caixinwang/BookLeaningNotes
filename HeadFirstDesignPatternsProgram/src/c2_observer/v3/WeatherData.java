package c2_observer.v3;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new LinkedList<Observer>();
    }

    public void measurementsChanged() {
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
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
