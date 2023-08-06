package designPatterns.structural.decorator;

//Concrete decorator for Sugar
public class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Sugar";
	}
}
