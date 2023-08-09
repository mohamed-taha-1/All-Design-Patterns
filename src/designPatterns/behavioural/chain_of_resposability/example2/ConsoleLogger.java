package designPatterns.behavioural.chain_of_resposability.example2;

public class ConsoleLogger extends Logger {
	public ConsoleLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Console Logger: " + message);
    }

}
