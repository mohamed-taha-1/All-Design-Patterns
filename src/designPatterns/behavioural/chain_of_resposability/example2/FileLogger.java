package designPatterns.behavioural.chain_of_resposability.example2;

public class FileLogger extends Logger {
	public FileLogger(LogLevel level) {
		this.level = level;
	}

	@Override
	protected void writeLog(String message) {
		System.out.println("File Logger: " + message);
	}

}
