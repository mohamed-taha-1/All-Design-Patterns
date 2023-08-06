package designPatterns.structural.proxy.triggerInteraction;

//Concrete implementation of PaymentGateway
public class ConcretePaymentGateway implements PaymentGateway {
	
	@Override
	public void processPayment(Order order) {
		// Simulate the payment process
		System.out.println("Processing payment for Order ID: " + order.getOrderId() + ", Amount: $" + order.getAmount());
		order.markAsPaid();
		System.out.println("Payment processed successfully.");
	}
}
