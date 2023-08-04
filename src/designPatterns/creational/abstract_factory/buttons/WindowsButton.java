package designPatterns.creational.abstract_factory.buttons;

import designPatterns.creational.abstract_factory.mainInterfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button.");
    }
}
