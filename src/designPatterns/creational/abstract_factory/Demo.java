package designPatterns.creational.abstract_factory;

import designPatterns.creational.abstract_factory.GUIs.MacGUIFactory;
import designPatterns.creational.abstract_factory.GUIs.WindowsGUIFactory;
import designPatterns.creational.abstract_factory.mainInterfaces.Button;
import designPatterns.creational.abstract_factory.mainInterfaces.Checkbox;
import designPatterns.creational.abstract_factory.mainInterfaces.GUIFactory;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <P> we use Abstract-factory pattern when we want to create a group of
		 * interdependent classes.
		 * 
		 * <T> we define an interface for families of object without specification of
		 * concrete class
		 * 
		 * <T> It allows you to create objects that are related to each other by a
		 * common theme while hiding the underlying implementation details.
		 * 
		 * 
		 * 
		 * <T> For example, in a GUI application, you might need to create a set of UI
		 * elements (buttons, text boxes, check-boxes)
		 */

		GUIFactory factory = getFactoryForCurrentPlatform();
		Button button = factory.createButton();
		button.render(); //Rendering a Windows button.
		
		
		Checkbox checkBox=factory.createCheckbox();
		checkBox.render(); //Rendering a Windows check-box.

	}

	private static GUIFactory getFactoryForCurrentPlatform() {
		String platform = System.getProperty("os.name").toLowerCase();

		if (platform.contains("windows")) {
			return new WindowsGUIFactory();
		} else if (platform.contains("mac")) {
			return new MacGUIFactory();
		}
		// -- if it Linux
		throw new UnsupportedOperationException("Unsupported platform.");
	}

}
