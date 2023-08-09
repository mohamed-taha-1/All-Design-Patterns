package designPatterns.behavioural.chain_of_resposability.example1;

public class Director extends Approver {
	@Override
	public void approveRequest(Request request) {
		if (request.getAmount() <= 5000) {
			System.out.println("Director approved the request.");
		} else if (nextApprover != null) {
			nextApprover.approveRequest(request);
		}
	}

}
