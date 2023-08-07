package designPatterns.structural.flyweight.example1;

public class CharacterFlyweightImpl implements CharacterFlyweight {
	private char character;

	public CharacterFlyweightImpl(char character) {
		this.character = character;
	}

	public void display(int fontSize) {
		System.out.println("Character: " + character + ", Font Size: " + fontSize);
	}

}
