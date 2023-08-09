package designPatterns.behavioural.chain_of_resposability.example1;

public class CEO extends Approver {
    @Override
    public void approveRequest(Request request) {
        System.out.println("CEO approved the request.");
    }
}
