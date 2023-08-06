package designPatterns.structural.adapter.exampl2;

//TemperatureConverter interface expected by the application
public interface TemperatureConverter {
	double convertToCelsius(double fahrenheitTemp);
}