package designPatterns.structural.adapter.exampl2;

//Adapter to convert TemperatureUtility to TemperatureConverter interface
public class TemperatureAdapter implements TemperatureConverter {
	private TemperatureUtility temperatureUtility;

	public TemperatureAdapter(TemperatureUtility temperatureUtility) {
		this.temperatureUtility = temperatureUtility;
	}

	@Override
	public double convertToCelsius(double fahrenheitTemp) {
		// Convert from Fahrenheit to Celsius using the existing TemperatureUtility
		double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
		return celsiusTemp;
	}

}
