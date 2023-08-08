package designPatterns.behavioural.command.example3;

import java.util.Stack;

public class CommandInvoker {
	private Stack<Command3> history = new Stack<>();

	public void executeCommand(Command3 command) {
		command.execute();
		history.push(command);
	}

	public void undoLastCommand() {
		if (!history.isEmpty()) {
			Command3 lastCommand = history.pop();
			if (lastCommand instanceof CopyCommand) {
				// Clear clipboard contents on undoing copy
				((CopyCommand) lastCommand).clipboard.copy("");
			}
		}
	}
}
