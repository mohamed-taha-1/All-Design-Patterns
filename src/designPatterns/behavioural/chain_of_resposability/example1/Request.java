package designPatterns.behavioural.chain_of_resposability.example1;

public class Request {

	private double amount;

	public Request(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
