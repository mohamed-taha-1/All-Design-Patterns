package designPatterns.structural.decorator;

//Concrete decorator for Milk
public class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 1.0;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Milk";
	}
}
