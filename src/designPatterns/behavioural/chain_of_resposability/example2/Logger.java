package designPatterns.behavioural.chain_of_resposability.example2;

public abstract class Logger {
	protected Logger nextLogger;
	protected LogLevel level;

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(LogLevel level, String message) {
		if (this.level.ordinal() <= level.ordinal()) {
			writeLog(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	protected abstract void writeLog(String message);

}


