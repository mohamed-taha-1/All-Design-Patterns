package designPatterns.structural.proxy;

import designPatterns.structural.proxy.protectObjects.ConcreteSensitiveDocument;
import designPatterns.structural.proxy.protectObjects.SensitiveDocument;
import designPatterns.structural.proxy.protectObjects.SensitiveDocumentProxy;
import designPatterns.structural.proxy.triggerInteraction.ConcretePaymentGateway;
import designPatterns.structural.proxy.triggerInteraction.Order;
import designPatterns.structural.proxy.triggerInteraction.PaymentGateway;
import designPatterns.structural.proxy.triggerInteraction.ProxyOrderProcessorTrigger;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> The goal of this pattern to protect some objects from direct impact.
		 * 
		 * <T> Also used to trigger interaction with object and trigger necessary
		 * behaviour if needed; he PROXY can log method invocations on the real subject,
		 * providing a convenient way to keep track of actions performed on the subject.
		 * 
		 * <P> The PROXY acts as an intermediary between the client and the real
		 * subject, providing additional functionalities or managing access to the real
		 * subject.
		 * 
		 * <p> The main intuition behind using the PROXY Pattern is to add an extra
		 * layer of control or behaviour to the real subject without modifying its code
		 * directly.
		 * 
		 * 
		 * 
		 */

		// -- Example for protect resource!
		SensitiveDocument realDocument = new ConcreteSensitiveDocument("Top-secret information");
		SensitiveDocument authorizedProxy = new SensitiveDocumentProxy(realDocument, "admin");
		SensitiveDocument unauthorizedProxy = new SensitiveDocumentProxy(realDocument, "guest");

		authorizedProxy.readDocument(); // return back the Official document
		unauthorizedProxy.readDocument(); // return unauthorised person. Access Denied

		System.out.println("\n\n");

		// ########  Example-2 for trigger interactions  ######
		Order order = new Order(1001, 50.99);

		// Create a payment gateway and the order processor
		PaymentGateway paymentGateway = new ConcretePaymentGateway();
		ProxyOrderProcessorTrigger orderProcessor = new ProxyOrderProcessorTrigger(paymentGateway);

		// Place the order
		orderProcessor.placeOrder(order);

		// Check if the order is paid
		if (order.isPaid()) {
			System.out.println("Order ID: " + order.getOrderId() + " has been paid successfully.");
		} else {
			System.out.println("Order ID: " + order.getOrderId() + " payment failed.");
		}

	}

}
