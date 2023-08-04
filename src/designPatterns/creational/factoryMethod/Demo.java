package designPatterns.creational.factoryMethod;

public class Demo {

	public static void main(String[] args) {

		/**
		 * <T> define interface to create object ; but let subclasses classes decide
		 * what concrete object to choose.. and what actual class to instantiate
		 * 
		 * 
		 * <T> we needed when we need to standard the architecture model for range of
		 * applications ;but each application decide what object to instantiate
		 * 
		 * 
		 * 
		 * <Q>what of we need to change the class under control to create objects from
		 * it ? <A> here we can use the factory method pattern, because it return back
		 * different implementation in runtime.
		 * 
		 * 
		 * <T> factory method it is a standard way to create objects
		 * 
		 * 
		 * 
		 * <T> we just change the behavioural on runtime `Override` method only
		 */

		// note that: I make DocumentGeneratorFactory to static ;

		FactoryMethodDocumentGenerator pdfGenerator = DocumentGeneratorFactory.createDocumentGenerator("PDF");
		pdfGenerator.generateDocument();

		FactoryMethodDocumentGenerator htmlGenerator = DocumentGeneratorFactory.createDocumentGenerator("HTML");
		htmlGenerator.generateDocument();

		FactoryMethodDocumentGenerator plainTextGenerator = DocumentGeneratorFactory
				.createDocumentGenerator("PlainText");
		plainTextGenerator.generateDocument();

		// test different thing; should return back ERROR.
		FactoryMethodDocumentGenerator WordGenerator = DocumentGeneratorFactory.createDocumentGenerator("WORD");
		WordGenerator.generateDocument();

	}

}
