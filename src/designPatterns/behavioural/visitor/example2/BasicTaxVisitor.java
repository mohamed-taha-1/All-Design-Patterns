package designPatterns.behavioural.visitor.example2;

public class BasicTaxVisitor implements TaxVisitor {
    @Override
    public void visit(Electronics electronics) {
        System.out.println("Calculating basic tax for electronics.");
    }

    @Override
    public void visit(Clothing clothing) {
        System.out.println("Calculating basic tax for clothing.");
    }
}
