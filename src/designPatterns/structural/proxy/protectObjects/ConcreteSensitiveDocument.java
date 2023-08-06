package designPatterns.structural.proxy.protectObjects;

//SensitiveDocument implementation
public class ConcreteSensitiveDocument implements SensitiveDocument {
	private String content;

	public ConcreteSensitiveDocument(String content) {
		this.content = content;
	}

	@Override
	public void readDocument() {
		System.out.println("Reading sensitive document: " + content);
	}
}
