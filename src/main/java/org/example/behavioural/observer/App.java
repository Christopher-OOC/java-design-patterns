package org.example.behavioural.observer;

public class App {

    static void main() {

        WeatherStation station = new WeatherStation();
        WeatherObserver observer1 = new WeatherObserver(station);
        WeatherObserver observer12 = new WeatherObserver(station);

        station.setHumidity(100);
        station.setPressure(2);
        station.setTemperature(34);

    }

}
