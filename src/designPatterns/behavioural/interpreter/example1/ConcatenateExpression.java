package designPatterns.behavioural.interpreter.example1;

public class ConcatenateExpression extends Expression {
	private Expression expression1;
	private Expression expression2;

	public ConcatenateExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public String interpret(Context context) {
		return expression1.interpret(context) + " " + expression2.interpret(context);
	}
}
