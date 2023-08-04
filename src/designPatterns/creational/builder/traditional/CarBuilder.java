package designPatterns.creational.builder.traditional;

public interface CarBuilder {

	CarBuilder setBrand(String brand);
    CarBuilder setModel(String model);
    CarBuilder setColor(String color);
    
    // based on 3 types above we can create 0:n constructors and so 0:n  different objects 
    Car build();
}
