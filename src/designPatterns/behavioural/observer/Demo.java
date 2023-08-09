package designPatterns.behavioural.observer;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <P> defines a dependency between objects, so that when one object (the
		 * subject) changes its state, all its dependents (observers) are notified and
		 * updated automatically.
		 * 
		 **/
		
		WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        Observer forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(forecastDisplay);

        // our notifier
        weatherData.setMeasurements(80, 65, 30.4f); // Output: Current conditions: 80.0F degrees and 65.0% humidity
             

	}

}
