package designPatterns.creational.factoryMethod;

public class PDFGenerator implements FactoryMethodDocumentGenerator {

	@Override
	public void generateDocument() {
		 System.out.println("Generating PDF document...");
	        // PDF generation logic goes here

	}

}
