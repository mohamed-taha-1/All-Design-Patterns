package designPatterns.creational.abstract_factory.GUIs;

import designPatterns.creational.abstract_factory.buttons.WindowsButton;
import designPatterns.creational.abstract_factory.checkBox.WindowsCheckbox;
import designPatterns.creational.abstract_factory.mainInterfaces.Button;
import designPatterns.creational.abstract_factory.mainInterfaces.Checkbox;
import designPatterns.creational.abstract_factory.mainInterfaces.GUIFactory;

public class WindowsGUIFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}
