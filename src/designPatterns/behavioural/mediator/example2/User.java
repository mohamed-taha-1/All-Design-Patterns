package designPatterns.behavioural.mediator.example2;

public abstract class User {
	protected ChatMediator mediator;

    public User(ChatMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);

}
