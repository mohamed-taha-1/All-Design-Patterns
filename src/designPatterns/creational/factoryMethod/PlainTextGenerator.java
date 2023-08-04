package designPatterns.creational.factoryMethod;

public class PlainTextGenerator implements FactoryMethodDocumentGenerator {

	@Override
	public void generateDocument() {
		 System.out.println("Generating plain text document...");
	        // Plain text generation logic goes here

	}

}
