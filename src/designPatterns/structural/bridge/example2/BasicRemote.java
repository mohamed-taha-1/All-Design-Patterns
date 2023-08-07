package designPatterns.structural.bridge.example2;

public class BasicRemote extends RemoteControl {
	public BasicRemote(TV tv) {
		super(tv);

	}

	@Override
	public
	void powerOn() {
		System.out.println("BasicRemote: Power ON");
        tv.turnOn();
		
	}

	@Override
	public
	void powerOff() {
		System.out.println("BasicRemote: Power OFF");
        tv.turnOff();
		
	}
}