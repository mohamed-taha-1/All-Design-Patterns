package designPatterns.structural.decorator;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> Decorator: Allows us to structure the objects in such way that allow us
		 * to add new feature to already existing objects. you can attach new behaviour
		 * and extend existing one.
		 * 
		 * <T> provide a way to add new features or responsibilities to objects in a
		 * more flexible manner than traditional inheritance. <DD> Rather than creating
		 * a subclass for each combination of features, the Decorator Pattern allows us
		 * to mix and match functionalities by wrapping objects with different
		 * decorators.
		 * 
		 * 
		 * 
		 * 
		 */

		// Create a simple coffee
		Coffee simpleCoffee = new SimpleCoffee();
		System.out.println("Cost: $" + simpleCoffee.getCost());
		System.out.println("Description: " + simpleCoffee.getDescription());

		// Add milk to the coffee
		Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
		System.out.println("Cost: $" + coffeeWithMilk.getCost());
		System.out.println("Description: " + coffeeWithMilk.getDescription());

		// Add sugar to the coffee
		Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
		System.out.println("Cost: $" + coffeeWithMilkAndSugar.getCost());
		System.out.println("Description: " + coffeeWithMilkAndSugar.getDescription());

	}

}
