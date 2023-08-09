package designPatterns.behavioural.chain_of_resposability.example2;

public class ConsoleLogger extends Logger {
	public ConsoleLogger(LogLevel level) {
		this.level = level;
	}

	@Override
	protected void writeLog(String message) {
		System.out.println("Console Logger: " + message);
	}

}
