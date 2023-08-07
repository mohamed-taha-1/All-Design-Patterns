package designPatterns.structural.flyweight.example1;

public class TextFormatter {
	private String text;
	private int fontSize;

	public TextFormatter(String text, int fontSize) {
		this.text = text;
		this.fontSize = fontSize;
	}

	public void format() {
		for (char c : text.toCharArray()) {
			CharacterFlyweight character = CharacterFlyweightFactory.getCharacterFlyweight(c);
			character.display(fontSize);
		}
	}
}
