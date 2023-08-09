package designPatterns.behavioural.template.example2;

public class LetterDocument  extends DocumentTemplate {
    @Override
    public void createHeader() {
        System.out.println("Generating letter header");
    }

    @Override
    public void addBody() {
        System.out.println("Adding letter content");
    }

    @Override
    public void addFooter() {
        System.out.println("Adding letter signature");
    }

}
