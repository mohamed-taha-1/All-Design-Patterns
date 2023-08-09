package designPatterns.behavioural.interpreter;

import designPatterns.behavioural.interpreter.example1.ColumnExpression;
import designPatterns.behavioural.interpreter.example1.ConcatenateExpression;
import designPatterns.behavioural.interpreter.example1.Context;
import designPatterns.behavioural.interpreter.example1.Expression;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> provides a way to evaluate and interpret language grammar or expressions.
		 * It's often used to solve problems related to parsing, processing, and
		 * executing domain-specific languages or expressions.
		 * 
		 * 
		 * <T> represent a language's grammar as a set of classes, each corresponding to
		 * a rule or expression in the language.
		 **/

		// example -1: SQL Query Parser:

		Context context = new Context();
		context.setColumnValue("name", "John");
		context.setColumnValue("age", "30");

		Expression expression = new ConcatenateExpression(new ColumnExpression("name"), new ColumnExpression("age"));

		String result = expression.interpret(context);
		System.out.println("Result: " + result); // Output: Result: John 30

	}

}
