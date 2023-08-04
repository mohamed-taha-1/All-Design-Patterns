package designPatterns.creational.builder;

import designPatterns.creational.builder.chain.CarChainBuilder;
import designPatterns.creational.builder.traditional.Car;
import designPatterns.creational.builder.traditional.CarBuilder;
import designPatterns.creational.builder.traditional.CarBuilderImpl;

public class Demo {

	public static void main(String[] args) {
		/**
		 * <P>
		 * The Builder Pattern is a creational design pattern in Java that is used to
		 * create complex objects step by step.
		 * 
		 * <p>
		 * It is especially useful when you have a class with many optional parameters,
		 * and you want to avoid having multiple constructors or a single constructor
		 * with many parameters.
		 * 
		 * <P>
		 * The intuition behind the Builder Pattern is to separate the construction of a
		 * complex object from its representation, allowing the same construction
		 * process to create different representations. by making separate interface for
		 * many constructors
		 * 
		 * 
		 * 
		 */

		// --- Track for our traditional builder
		CarBuilder builder = new CarBuilderImpl();
		Car car = builder.setBrand("Toyota").setModel("RAV4").setColor("Blue").build();

		CarBuilder builder2 = new CarBuilderImpl();
		Car car2 = builder2.setBrand("Tesla").setModel("Model 3").build();

		System.out.println("Car1 created: " + car);
		System.out.println("Car2 created: " + car2);

		System.out.println("\t\t\t\t :::::::::: \t");

		// --- Now track for our chain builder
		CarChainBuilder carChain = CarChainBuilder.newBuilder().setModel("Model 4").setBrand("Mercedes-Benz")
				.setColor("Black").build();
		CarChainBuilder carChain2 = CarChainBuilder.newBuilder().setColor("green").setModel("Model 5").setBrand("Audi")
				.build();

		System.out.println("carChain1 created: " + carChain);
		System.out.println("carChain2 created: " + carChain2);
	}

}
