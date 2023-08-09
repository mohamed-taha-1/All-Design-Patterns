package designPatterns.behavioural.memento.example1;

import java.util.Stack;

public class TextEditor {
	 private StringBuilder content = new StringBuilder();
	    private Stack<TextMemento> history = new Stack<>();

	    public void appendText(String text) {
	        history.push(new TextMemento(content.toString()));
	        content.append(text);
	    }

	    public void undo() {
	        if (!history.isEmpty()) {
	            content = new StringBuilder(history.pop().getText());
	        }
	    }

	    public String getContent() {
	        return content.toString();
	    }

}
