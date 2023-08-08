package designPatterns.behavioural.command.example4;

import java.io.File;

public class CreateFolderCommand implements commandFolderInterface{
	
	  private File folder;

	    public CreateFolderCommand(String folderPath) {
	        this.folder = new File(folderPath);
	    }

	    @Override
	    public void execute() {
	        if (!folder.exists()) {
	            folder.mkdir();
	            System.out.println("Folder created: " + folder.getPath());
	        }
	    }

	    @Override
	    public void undo() {
	        if (folder.exists() && folder.isDirectory()) {
	            if (folder.delete()) {
	                System.out.println("Folder deleted: " + folder.getPath());
	            } else {
	                System.out.println("Failed to delete folder: " + folder.getPath());
	            }
	        }
	    }

}
