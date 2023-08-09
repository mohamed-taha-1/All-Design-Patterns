package designPatterns.behavioural.visitor;

import designPatterns.behavioural.visitor.example1.Element;
import designPatterns.behavioural.visitor.example1.Image;
import designPatterns.behavioural.visitor.example1.Paragraph;
import designPatterns.behavioural.visitor.example1.TextVisitor;
import designPatterns.behavioural.visitor.example1.Visitor;
import designPatterns.behavioural.visitor.example2.BasicTaxVisitor;
import designPatterns.behavioural.visitor.example2.Clothing;
import designPatterns.behavioural.visitor.example2.Electronics;
import designPatterns.behavioural.visitor.example2.Product;
import designPatterns.behavioural.visitor.example2.TaxVisitor;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * <P> It t allows you to add new operations to existing classes without
		 * modifying/changing the classes of elements on which it operates.
		 * 
		 * <P> you'd create an interface or base class that defines an accept method
		 * that takes a visitor as an argument. Each concrete class implementing this
		 * interface will then implement the accept method.
		 * 
		 * <T> Visitor is anther abstraction over the main interface, define on it the old and new methods based on old and new concrete classes
		 * 
		 * 
		 * <Q> decorator vs visitor? Decorator works-on single object but Visitor works-on multiple/hierarchy of elements
		 * 
		 **/

		Element[] elements = { new Paragraph(), new Image() };
		Visitor visitor = new TextVisitor();

		for (Element element : elements) {
			element.accept(visitor);
		}
		
		//--------------------------Example -2 
		System.out.println("*************************\n");
		Product[] products = {new Electronics(), new Clothing()};
        TaxVisitor taxVisitor = new BasicTaxVisitor();

        for (Product product : products) {
            product.accept(taxVisitor);
        }
		

	}

}
