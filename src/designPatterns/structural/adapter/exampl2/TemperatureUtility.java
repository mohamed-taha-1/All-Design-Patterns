package designPatterns.structural.adapter.exampl2;

//Utility class to convert temperature from Fahrenheit to Celsius
public class TemperatureUtility {
	public double convertToFahrenheit(double celsiusTemp) {
		return (celsiusTemp * 9 / 5) + 32;
	}
}
