package designPatterns.behavioural.state;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> allows an object to change its behaviour when its internal state changes.
		 * 
		 **/

		VendingMachine vendingMachine = new VendingMachine();

		vendingMachine.insertCoin(); // Output: Coin inserted. Product selection available.
		vendingMachine.selectProduct(); // Output: Product selected. Please dispense.
		vendingMachine.dispense(); // Output: No product selected.

		vendingMachine.insertCoin(); // Output: Coin already inserted. Product selection available.
		vendingMachine.dispense(); // Output: Product dispensed. Thank you!

	}

}
