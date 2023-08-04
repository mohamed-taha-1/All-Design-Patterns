package designPatterns.creational.singletone;

public class Demo {

	public static void main(String[] args) {
		SingleTone instance1 = SingleTone.createInstance();
		SingleTone instance2 = SingleTone.createInstance();
		SingleTone instance3 = SingleTone.createInstance();
		SingleTone instance4 = SingleTone.createInstance();
		SingleTone instance5 = SingleTone.createInstance();

		System.out.println(instance1 == instance2); // Output: true
		System.out.println(instance3 == instance4); // Output: false
		System.out.println(instance4 == instance5); // Output: true
	}

}
