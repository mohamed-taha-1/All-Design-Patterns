package designPatterns.behavioural.memento;

import designPatterns.behavioural.memento.example1.TextEditor;
import designPatterns.behavioural.memento.example2.Game;
import designPatterns.behavioural.memento.example2.GameStateManager;
import designPatterns.behavioural.memento.example2.GameStateMemento;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <P> allows you to capture and store the internal state of an object without
		 * exposing its internal structure.
		 * 
		 * <T> This captured state can then be restored to the object at a later time,
		 * effectively enabling you to implement "undo" or "rollback" functionality.
		 * 
		 * 
		 * <T> it separate the responsibility of maintaining the object's state and
		 * managing that state's history.
		 * 
		 **/

		// example -1 : Text Editor Undo/Redo:

		TextEditor editor = new TextEditor();
		editor.appendText("Hello, ");
		editor.appendText("world!");

		System.out.println(editor.getContent()); // Output: Hello, world!

		editor.undo();
		System.out.println(editor.getContent()); // Output: Hello,

		// example -2
		System.out.println("\n*******************************************\n");
		Game game = new Game();
		GameStateManager manager = new GameStateManager();

		game.play(50);
		game.play(60);

		manager.saveState(game.save());

		game.play(30);
		game.play(20);

		game.displayState(); // Output: Level: 2, Score: 50

		GameStateMemento lastSavedState = manager.getLastSavedState();
		if (lastSavedState != null) {
			game.load(lastSavedState);
		}

		game.displayState(); // Output: Level: 1, Score: 110

	}

}
