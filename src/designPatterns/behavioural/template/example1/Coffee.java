package designPatterns.behavioural.template.example1;

public class Coffee extends BeverageTemplate {
	@Override
	public void brew() {
		System.out.println("Brewing coffee");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}

}
