package designPatterns.structural.flyweight;

import designPatterns.structural.flyweight.example1.TextFormatter;
import designPatterns.structural.flyweight.example2.InstrumentOrder;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 
		 * <T> It used to optimize the memory usage of objects when dealing with a large
		 * number of instances that share common state.
		 * 
		 * <T> It aims to reduce the memory by reusing the same shared objects instead
		 * of creating new ones for identical data.
		 * 
		 **/

		TextFormatter textFormatter = new TextFormatter("Hello, Flyweight Pattern!", 12);
		textFormatter.format();

		System.out.println("\n\n*********");

		// Example-2: instrumentType here is: 
		InstrumentOrder order1 = new InstrumentOrder("John", "Guitar");
		order1.processOrder(); // Output: Sold Guitar to John ; instrumentType here is:  guitar

		InstrumentOrder order2 = new InstrumentOrder("Jane", "Piano");
		order2.processOrder(); // Output: Sold Piano to Jane; instrumentType here is: piano

		InstrumentOrder order3 = new InstrumentOrder("Mike", "Guitar");
		order3.processOrder(); // Output: Sold Guitar to Mike !!??(Note: Reuses the "Guitar" flyweight) 
	}

}
