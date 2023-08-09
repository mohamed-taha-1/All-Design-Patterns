package designPatterns.behavioural.visitor.example1;

public interface Visitor {
	 void visit(Paragraph paragraph);
	    void visit(Image image);
}
