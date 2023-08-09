package designPatterns.behavioural.mediator.example2;

public interface ChatMediator {

	 void addUser(User user);
	    void sendMessage(User sender, String message);
}
