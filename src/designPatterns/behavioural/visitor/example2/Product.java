package designPatterns.behavioural.visitor.example2;

public interface Product {
    void accept(TaxVisitor visitor);
}
