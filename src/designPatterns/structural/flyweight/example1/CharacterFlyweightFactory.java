package designPatterns.structural.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
	
	private static Map<Character, CharacterFlyweight> flyweights = new HashMap<>();

    public static CharacterFlyweight getCharacterFlyweight(char character) {
        flyweights.putIfAbsent(character, new CharacterFlyweightImpl(character));
        return flyweights.get(character);
    }

}
