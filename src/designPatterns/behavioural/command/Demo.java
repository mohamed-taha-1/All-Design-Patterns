package designPatterns.behavioural.command;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import designPatterns.behavioural.command.example1.RemoteControl;
import designPatterns.behavioural.command.example1.TV;
import designPatterns.behavioural.command.example1.TVOffCommand;
import designPatterns.behavioural.command.example1.TVOnCommand;
import designPatterns.behavioural.command.example2.AddTextCommand;
import designPatterns.behavioural.command.example2.Command;
import designPatterns.behavioural.command.example2.TextEditor;
import designPatterns.behavioural.command.example2.UndoRedoManager;
import designPatterns.behavioural.command.example3.Clipboard;
import designPatterns.behavioural.command.example3.Command3;
import designPatterns.behavioural.command.example3.CommandInvoker;
import designPatterns.behavioural.command.example3.CopyCommand;
import designPatterns.behavioural.command.example3.PasteCommand;
import designPatterns.behavioural.command.example3.TextEditor3;
import designPatterns.behavioural.command.example4.CreateFolderCommand;
import designPatterns.behavioural.command.example4.FolderCommandInvoker;
import designPatterns.behavioural.command.example4.commandFolderInterface;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> it describe how to create an object from a request
		 *
		 * <T> there are many benefits from having a request as an object; like put it
		 * in a queue orElse
		 * 
		 * <Example> CTR+C: it is a request that runs code behind the scene
		 * 
		 **/

		TV tv = new TV();
		TVOnCommand tvOnCommand = new TVOnCommand(tv);
		TVOffCommand tvOffCommand = new TVOffCommand(tv);

		RemoteControl remote = new RemoteControl();

		// Turn on TV
		remote.setCommand(tvOnCommand);
		remote.pressButton();

		// Turn off TV
		remote.setCommand(tvOffCommand);
		remote.pressButton();

		System.out.println("\n\n******");

		/* *************************************** *******************Example-2 */

		TextEditor editor = new TextEditor();
		UndoRedoManager undoRedoManager = new UndoRedoManager();

		// Add and undo commands
		Command addHello = new AddTextCommand(editor, "Hello, TAHA ");
		Command addWorld = new AddTextCommand(editor, "World!");

		undoRedoManager.executeCommand(addHello);
		undoRedoManager.executeCommand(addWorld);

		System.out.println(editor.getContent()); // Output: "Hello, TAHA World!"

		undoRedoManager.undoLastCommand();
		System.out.println(editor.getContent()); // Output: "Hello,TAHA "

		undoRedoManager.redoLastUndo();
		System.out.println(editor.getContent()); // Output: "Hello,TAHA World!"

		System.out.println("\n\n\n****************");

		/*
		 * *************************************** ***************************Example-3
		 * copy-and-paste
		 */

		TextEditor3 editorCopyAndPaste = new TextEditor3();
		Clipboard clipboard = new Clipboard();
		CommandInvoker invoker = new CommandInvoker();

		// Copy and paste commands
		Command3 copyCommand = new CopyCommand(clipboard, "Hello, Mohamed world!");
		Command3 pasteCommand = new PasteCommand(clipboard, editorCopyAndPaste);

		invoker.executeCommand(copyCommand);
		invoker.executeCommand(pasteCommand);

		System.out.println(editorCopyAndPaste.getText()); // Output: "Hello, Mohamed world!"

		invoker.undoLastCommand();
		System.out.println(editorCopyAndPaste.getText()); // Output: ""

		invoker.undoLastCommand(); // No effect on undoing paste

		/*
		 * *************************************** ***************************Example-4
		 * make folders from what window we are stayed in like mouse-shortCut
		 */

		String currentDirectory = System.getProperty("user.dir");
		System.out.println("Current working directory: " + currentDirectory);

		String folderPath = "tahaNewFolder";
		FolderCommandInvoker folderInvoker = new FolderCommandInvoker();
		commandFolderInterface createFolderCommand = new CreateFolderCommand(folderPath);

		folderInvoker.setCommand(createFolderCommand);
		folderInvoker.executeCommand();

		// -- to delete the last folder created
//        createFolderCommand.undo();

		// To undo folder creation
//         folderInvoker.undoLastCommand();
		
		
		
		
		/*
		 * *************************************** ***************************Example-5 without command pattern for funny 
		 * create screen shot 
		 */
		try {
            // Create a Robot instance
            Robot robot = new Robot();

            // Capture the screen
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenshot = robot.createScreenCapture(screenRect);

            // Save the screenshot to a file
            File output = new File("TahaScreenshot.png");
            ImageIO.write(screenshot, "png", output);

            System.out.println("Screenshot saved: " + output.getAbsolutePath());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }

	}

}
