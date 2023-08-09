package designPatterns.behavioural.chain_of_resposability.example2;

public class EmailLogger extends Logger {
    public EmailLogger(LogLevel level) {
        this.level = level;
    }

    @Override
    protected void writeLog(String message) {
        System.out.println("Email Logger: " + message);
    }

}
