package designPatterns.behavioural.visitor.example2;

public interface TaxVisitor {

	void visit(Electronics electronics);
    void visit(Clothing clothing);
}
