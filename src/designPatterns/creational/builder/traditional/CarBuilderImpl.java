package designPatterns.creational.builder.traditional;

public class CarBuilderImpl  implements CarBuilder {

	    private Car car;
	    
	    public CarBuilderImpl() {
	        car = new Car();
	    }
	    
	    @Override
	    public CarBuilder setBrand(String brand) {
	        car.setBrand(brand);
	        return this;
	    }
	    
	    @Override
	    public CarBuilder setModel(String model) {
	        car.setModel(model);
	        return this;
	    }
	    
	    @Override
	    public CarBuilder setColor(String color) {
	        car.setColor(color);
	        return this;
	    }
	    
	    @Override
	    public Car build() {
	        return car;
	    }

}
