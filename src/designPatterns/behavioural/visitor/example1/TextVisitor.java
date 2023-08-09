package designPatterns.behavioural.visitor.example1;

public class TextVisitor implements Visitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Visiting paragraph and printing text.");
    }

    @Override
    public void visit(Image image) {
        System.out.println("Visiting image and printing alt text.");
    }

}
