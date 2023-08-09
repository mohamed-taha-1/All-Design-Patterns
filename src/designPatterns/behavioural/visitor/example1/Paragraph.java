package designPatterns.behavioural.visitor.example1;

public class Paragraph   implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

