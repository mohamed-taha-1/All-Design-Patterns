package designPatterns.behavioural.interpreter.example1;

import java.util.HashMap;
import java.util.Map;

public class Context {

	private Map<String, String> data = new HashMap<>();

	public void setColumnValue(String columnName, String value) {
		data.put(columnName, value);
	}

	public String getColumnValue(String columnName) {
		return data.get(columnName);
	}
}
