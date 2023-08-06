package designPatterns.structural.adapter;

import designPatterns.structural.adapter.exampl2.TemperatureAdapter;
import designPatterns.structural.adapter.exampl2.TemperatureConverter;
import designPatterns.structural.adapter.exampl2.TemperatureUtility;
import designPatterns.structural.adapter.example1.LegacyPrinter;
import designPatterns.structural.adapter.example1.Printer;
import designPatterns.structural.adapter.example1.PrinterAdapter;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <P> that allows incompatible interfaces to work together.
		 * 
		 * <P> It acts as a bridge between two interfaces, converting the interface of
		 * one class into another interface that the client expects.
		 * 
		 * 
		 * <P> This pattern enables classes with different interfaces to collaborate and
		 * interact smoothly.
		 * 
		 * 
		 * <T> It provide a way to make existing classes work with other classes without
		 * modifying their code.
		 * 
		 */

		LegacyPrinter legacyPrinter = new LegacyPrinter();

		// Adapt the LegacyPrinter to the Printer interface
		Printer printer = new PrinterAdapter(legacyPrinter);
		// Use the Printer interface to print
		printer.print("Hello, Adapter Pattern!");

		System.out.println("\n******");

		// Example-2
		// Create a TemperatureUtility
		double fahrenheitTemp = 68.0;
		TemperatureUtility temperatureUtility = new TemperatureUtility();

		// Adapt the TemperatureUtility to the TemperatureConverter interface
		TemperatureConverter converter = new TemperatureAdapter(temperatureUtility);
		double celsiusTemp = converter.convertToCelsius(fahrenheitTemp);

		System.out.println(fahrenheitTemp + " Fahrenheit is equal to " + celsiusTemp + " Celsius.");

	}

}
