package designPatterns.creational.abstract_factory.checkBox;

import designPatterns.creational.abstract_factory.mainInterfaces.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Mac checkbox.");
    }

}
