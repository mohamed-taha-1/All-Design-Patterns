package designPatterns.behavioural.chain_of_resposability.example2;

public class EmailLogger extends Logger {
	private String emailAddress;

    public EmailLogger(LogLevel level, String emailAddress) {
        super(level);
        this.emailAddress = emailAddress;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Email Logger: Sending email to " + emailAddress + ": " + message);
    }
}
