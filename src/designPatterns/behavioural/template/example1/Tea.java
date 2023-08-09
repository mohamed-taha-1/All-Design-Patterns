package designPatterns.behavioural.template.example1;

public class Tea extends BeverageTemplate {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

}
