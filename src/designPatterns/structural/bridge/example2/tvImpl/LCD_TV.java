package designPatterns.structural.bridge.example2.tvImpl;

import designPatterns.structural.bridge.example2.TV;

public class LCD_TV implements TV {
	@Override
	public void turnOn() {
		System.out.println("LCD TV is ON");
	}

	@Override
	public void turnOff() {
		System.out.println("LCD TV is OFF");
	}

}
