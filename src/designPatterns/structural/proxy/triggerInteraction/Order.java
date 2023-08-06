package designPatterns.structural.proxy.triggerInteraction;

//Order class
public class Order {
	private int orderId;
	private double amount;
	private boolean isPaid;

	public Order(int orderId, double amount) {
		this.orderId = orderId;
		this.amount = amount;
		this.isPaid = false;
	}

	public int getOrderId() {
		return orderId;
	}

	public double getAmount() {
		return amount;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void markAsPaid() {
		isPaid = true;
	}
}
