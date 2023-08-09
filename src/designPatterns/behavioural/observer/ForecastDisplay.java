package designPatterns.behavioural.observer;

public class ForecastDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast: Improving weather on the way!");
    }

}
