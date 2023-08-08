package designPatterns.behavioural.command.example1;



//Concrete command classes
public class TVOnCommand implements Command {
	private TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOn();
	}
}
