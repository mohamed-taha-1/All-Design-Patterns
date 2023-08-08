package designPatterns.behavioural.command.example1;


//Invoker class
public class RemoteControl {
 private Command command;

 public void setCommand(Command command) {
     this.command = command;
 }

 public void pressButton() {
     command.execute();
 }
}
