package designPatterns.behavioural.command.example3;

//Receiver class for text editing
public class TextEditor3 {
	private StringBuilder text = new StringBuilder();

	public void insertText(String newText) {
		text.append(newText);
	}

	public String getText() {
		return text.toString();
	}
}
