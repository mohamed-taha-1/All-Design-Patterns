package designPatterns.structural.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

public class InstrumentFlyweightFactory {
	
	private static Map<String, InstrumentFlyweight> flyweights = new HashMap<>();

    public static InstrumentFlyweight getInstrumentFlyweight(String instrumentType) {
        flyweights.putIfAbsent(instrumentType, new InstrumentFlyweightImpl(instrumentType));
        return flyweights.get(instrumentType);
    }

}
