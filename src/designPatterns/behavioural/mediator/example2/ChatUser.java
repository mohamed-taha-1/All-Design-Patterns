package designPatterns.behavioural.mediator.example2;

public class ChatUser extends User {
    private String name;

    public ChatUser(String name, ChatMediator mediator) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }

}
