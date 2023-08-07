package designPatterns.structural.bridge.example2.tvImpl;

import designPatterns.structural.bridge.example2.TV;

public class LED_TV implements TV {
	@Override
	public void turnOn() {
		System.out.println("LED TV is ON");
	}

	@Override
	public void turnOff() {
		System.out.println("LED TV is OFF");
	}

}
