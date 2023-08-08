package designPatterns.behavioural.command.example3;

//Concrete command class for copying text
public class CopyCommand implements Command3 {
	public Clipboard clipboard;
	private String text;

	public CopyCommand(Clipboard clipboard, String text) {
		this.clipboard = clipboard;
		this.text = text;
	}

	@Override
	public void execute() {
		clipboard.copy(text);
	}
}