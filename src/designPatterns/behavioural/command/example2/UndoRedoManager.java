package designPatterns.behavioural.command.example2;

import java.util.Stack;

//Invoker class
public class UndoRedoManager {
	private Stack<Command> undoStack;
	private Stack<Command> redoStack;

	public UndoRedoManager() {
		undoStack = new Stack<>();
		redoStack = new Stack<>();
	}

	public void executeCommand(Command command) {
		command.execute();
		undoStack.push(command);
		redoStack.clear();
	}

	public void undoLastCommand() {
		if (!undoStack.isEmpty()) {
			Command lastCommand = undoStack.pop();
			lastCommand.undo();
			redoStack.push(lastCommand);
		}
	}

	public void redoLastUndo() {
		if (!redoStack.isEmpty()) {
			Command lastUndo = redoStack.pop();
			lastUndo.execute();
			undoStack.push(lastUndo);
		}
	}
}
