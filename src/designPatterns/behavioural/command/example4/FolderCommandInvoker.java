package designPatterns.behavioural.command.example4;

public class FolderCommandInvoker {
	
	private commandFolderInterface command;

    public void setCommand(commandFolderInterface command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void undoLastCommand() {
        command.undo();
    }

}
