package designPatterns.creational.factoryMethod;

public class HTMLGenerator implements FactoryMethodDocumentGenerator {

	@Override
	public void generateDocument() {
		 System.out.println("Generating HTML document...");
	        // HTML generation logic goes here

	}

}
