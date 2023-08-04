package designPatterns.creational.singletone;

public class SingleTone {

	private static SingleTone instance;
	private static int COUNT = 0;

	// Private constructor to prevent instantiation from other classes
	private SingleTone() {
		System.out.println(COUNT);
	}

	public static synchronized SingleTone createInstance() {

		if (instance == null || COUNT < 4) {
			instance = new SingleTone();
			// Decrement COUNT only once for each instance creation

		}
		COUNT++;
		return instance;

	}

	public void showMessage() {
		System.out.println("Hello, I am the singleton instance!");
	}
}
