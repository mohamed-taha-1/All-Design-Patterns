package designPatterns.behavioural.command.example2;

/*
 * Text Editor with Undo/Redo Functionality
 * */
public interface Command {
	void execute();

	void undo();
}
