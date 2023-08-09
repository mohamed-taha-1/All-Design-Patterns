package designPatterns.behavioural.chain_of_resposability.example1;

public abstract class Approver {

	protected Approver nextApprover;

	public void setNextApprover(Approver nextApprover) {
		this.nextApprover = nextApprover;
	}

	public abstract void approveRequest(Request request);
}
