package designPatterns.structural.adapter.example1;

//Legacy Printer with a different interface
public class LegacyPrinter {

	public void print(String text) {
		System.out.println("Legacy Printer: " + text);
	}
}