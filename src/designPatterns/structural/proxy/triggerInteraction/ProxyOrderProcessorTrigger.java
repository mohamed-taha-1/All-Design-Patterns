package designPatterns.structural.proxy.triggerInteraction;

// OrderProcessor class as a trigger for interaction
public class ProxyOrderProcessorTrigger {

	private PaymentGateway paymentGateway;

	public ProxyOrderProcessorTrigger(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public void placeOrder(Order order) {
		System.out.println("Placing order with Order ID: " + order.getOrderId() + ", Amount: $" + order.getAmount());
		paymentGateway.processPayment(order);
	}
}
