package designPatterns.behavioural.command.example2;

public class TextEditor {
	private StringBuilder content;

	public TextEditor() {
		content = new StringBuilder();
	}

	public void addText(String text) {
		content.append(text);
	}

	public void deleteLastText(int length) {
		if (content.length() >= length) {
			content.delete(content.length() - length, content.length());
		}
	}

	public String getContent() {
		return content.toString();
	}
}
