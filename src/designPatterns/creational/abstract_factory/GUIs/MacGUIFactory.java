package designPatterns.creational.abstract_factory.GUIs;

import designPatterns.creational.abstract_factory.buttons.MacButton;
import designPatterns.creational.abstract_factory.checkBox.MacCheckbox;
import designPatterns.creational.abstract_factory.mainInterfaces.Button;
import designPatterns.creational.abstract_factory.mainInterfaces.Checkbox;
import designPatterns.creational.abstract_factory.mainInterfaces.GUIFactory;

public class MacGUIFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

}
