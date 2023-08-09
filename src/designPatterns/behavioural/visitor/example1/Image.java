package designPatterns.behavioural.visitor.example1;

public class Image implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
