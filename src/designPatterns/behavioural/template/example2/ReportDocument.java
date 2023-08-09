package designPatterns.behavioural.template.example2;

public class ReportDocument extends DocumentTemplate {
	@Override
	public void createHeader() {
		System.out.println("Generating report header");
	}

	@Override
	public void addBody() {
		System.out.println("Adding report content");
	}

	@Override
	public void addFooter() {
		System.out.println("Adding report footer");
	}

}
