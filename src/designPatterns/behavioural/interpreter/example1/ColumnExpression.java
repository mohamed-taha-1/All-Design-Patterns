package designPatterns.behavioural.interpreter.example1;

public class ColumnExpression extends Expression {
    private String columnName;

    public ColumnExpression(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String interpret(Context context) {
        return context.getColumnValue(columnName);
    }

}
