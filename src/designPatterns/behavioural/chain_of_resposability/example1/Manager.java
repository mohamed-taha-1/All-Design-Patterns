package designPatterns.behavioural.chain_of_resposability.example1;

public class Manager extends Approver {
	
	
	@Override
	public void approveRequest(Request request) {
		if (request.getAmount() <= 1000) {
			System.out.println("Manager approved the request.");
		} else if (nextApprover != null) {
			nextApprover.approveRequest(request);
		}
	}

}
