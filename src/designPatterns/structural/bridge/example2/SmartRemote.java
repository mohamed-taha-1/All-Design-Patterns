package designPatterns.structural.bridge.example2;

public class SmartRemote extends RemoteControl {
	public SmartRemote(TV tv) {
		super(tv);
	}

	@Override
	public void powerOn() {
		System.out.println("SmartRemote: Power ON");
		tv.turnOn();

	}

	@Override
	public void powerOff() {
		System.out.println("SmartRemote: Power OFF");
		tv.turnOff();

	}
}
