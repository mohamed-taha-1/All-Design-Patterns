package designPatterns.behavioural.chain_of_resposability.example2;

public abstract class Logger {
	protected LogLevel level;
    protected Logger nextLogger;

    public Logger(LogLevel level) {
        this.level = level;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(LogLevel messageLevel, String message) {
        if (level.ordinal() <= messageLevel.ordinal()) {
            writeMessage(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(messageLevel, message);
        }
    }

    protected abstract void writeMessage(String message);

}


