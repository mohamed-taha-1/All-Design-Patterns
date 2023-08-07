package designPatterns.structural.bridge.example2;

//Abstraction
public abstract class RemoteControl {
	protected TV tv;

	public RemoteControl(TV tv) {
		this.tv = tv;
	}

	public abstract void powerOn();

	public abstract void powerOff();
}
