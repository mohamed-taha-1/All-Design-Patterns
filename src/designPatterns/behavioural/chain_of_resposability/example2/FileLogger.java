package designPatterns.behavioural.chain_of_resposability.example2;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {
	private String logFileName;

	public FileLogger(LogLevel level, String logFileName) {
		super(level);
		this.logFileName = logFileName;
	}

	@Override
	protected void writeMessage(String message) {
		try {
			FileWriter writer = new FileWriter(logFileName, true);
			writer.write("File Logger: " + message + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
