package designPatterns.behavioural.command.example3;

// Receiver class for clipboard
public class Clipboard {
    private String contents;

    public void copy(String text) {
        contents = text;
    }

    public String getContents() {
        return contents;
    }
}