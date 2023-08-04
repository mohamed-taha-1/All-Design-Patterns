package designPatterns.creational.abstract_factory.buttons;

import designPatterns.creational.abstract_factory.mainInterfaces.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering aMac button.");
    }

}
