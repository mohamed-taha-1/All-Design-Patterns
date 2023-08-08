package designPatterns.behavioural.command.example3;

//Concrete command class for pasting text
public class PasteCommand implements Command3 {
	private Clipboard clipboard;
	private TextEditor3 editor;

	public PasteCommand(Clipboard clipboard, TextEditor3 editor) {
		this.clipboard = clipboard;
		this.editor = editor;
	}

	@Override
	public void execute() {
		editor.insertText(clipboard.getContents());
	}
}