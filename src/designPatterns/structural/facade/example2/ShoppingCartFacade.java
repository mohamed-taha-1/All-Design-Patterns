package designPatterns.structural.facade.example2;

public class ShoppingCartFacade {

	private Inventory inventory;
	private Payment payment;
	private Shipping shipping;

	public ShoppingCartFacade() {
		inventory = new Inventory();
		payment = new Payment();
		shipping = new Shipping();
	}

	// Simplified methods for clients to interact with the shopping cart
	public void addToCart(String item) {
		inventory.addToCart(item);
	}

	public void checkout(double totalAmount) {
		payment.processPayment(totalAmount);
		shipping.shipItems();
	}
}
