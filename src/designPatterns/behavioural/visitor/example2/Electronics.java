package designPatterns.behavioural.visitor.example2;

public class Electronics implements Product {
    @Override
    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }
}
