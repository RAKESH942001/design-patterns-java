package org.example.behaviouralPattern.observer;

public class CurrentWeatherConditionsDisplay implements Observer{

    private int temperature;

    public CurrentWeatherConditionsDisplay(Observable observable) {
        observable.registerObserver(this);
    }

    private int


            humidity;
    @Override
    public void update(int temperature, int humidity) {

    }
}
