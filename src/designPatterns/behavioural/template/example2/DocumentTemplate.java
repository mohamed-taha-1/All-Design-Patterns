package designPatterns.behavioural.template.example2;

public abstract class DocumentTemplate {
	
	public void generateDocument() {
        createHeader();
        addBody();
        addFooter();
    }

    abstract void createHeader();
    abstract void addBody();
    abstract void addFooter();

}
