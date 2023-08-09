package designPatterns.behavioural.memento.example1;

public class TextMemento {
	private final String text;

	public TextMemento(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
