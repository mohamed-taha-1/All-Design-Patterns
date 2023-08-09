package designPatterns.behavioural.template;

import designPatterns.behavioural.template.example1.BeverageTemplate;
import designPatterns.behavioural.template.example1.Coffee;
import designPatterns.behavioural.template.example1.Tea;
import designPatterns.behavioural.template.example2.DocumentTemplate;
import designPatterns.behavioural.template.example2.LetterDocument;
import designPatterns.behavioural.template.example2.ReportDocument;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> This pattern used to define the structure of algorithm and let subclasses
		 * decide the implementation of specific steps of this algorithms without
		 * changing its overall structure
		 * 
		 * <T> If there are common methods,is used to provide a framework for creating
		 * algorithms or processes with a common structure while allowing certain parts
		 * of the algorithm to be customized by subclasses.
		 **/

		BeverageTemplate coffee = new Coffee();
		coffee.prepareBeverage();

		System.out.println("-------------");

		BeverageTemplate tea = new Tea();
		tea.prepareBeverage();

		/*
		 * ------------ EXAMPLE 2 ----------------
		 */
		System.out.println("---------*********   *************----------");

		DocumentTemplate report = new ReportDocument();
		report.generateDocument();

		System.out.println("----------");

		DocumentTemplate letter = new LetterDocument();
		letter.generateDocument();

	}

}
