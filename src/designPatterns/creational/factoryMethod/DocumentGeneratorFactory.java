package designPatterns.creational.factoryMethod;

public class DocumentGeneratorFactory {

	
	// our central switch implementation
	public static FactoryMethodDocumentGenerator createDocumentGenerator(String type) {

		switch (type.toLowerCase()) {
		case "pdf":
			return new PDFGenerator();
		case "html":
			return new HTMLGenerator();
		case "plaintext":
			return new PlainTextGenerator();
		default:
			throw new IllegalArgumentException("Invalid document type: " + type);
		}

	}
}
