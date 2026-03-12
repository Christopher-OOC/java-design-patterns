package org.example.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observers;

    public  WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer o : observers) {
            o.update(pressure, temperature, humidity);
        }
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObserver();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObserver();
    }
}
