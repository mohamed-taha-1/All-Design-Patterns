package designPatterns.creational.protoType;

public class Demo {

	public static void main(String[] args) {

		/**
		 * <T> You can create new objects faster without `New` keyword; Just clone from
		 * porotoType.
		 * 
		 * <T> It is like a copy an file from a directory and paste it in anther
		 * directory;
		 * 
		 * <T> Actually it created based on the previous one. So, we create the Object
		 * with `New` just one, and reused with clone after that.
		 * 
		 * <br/>
		 * 
		 * <Q1>why we needed when we can use clone ? <A1> -> Because the cloned object
		 * will have the same field values as the original object.
		 * 
		 * 
		 */

		try {
			// first creation of the object
			ProtoTypeEmolyee originalEmployee = new ProtoTypeEmolyee("John Doe", 30, "Engineering");

			// Clone the original employee to create a new employee
			ProtoTypeEmolyee clonedEmployee = originalEmployee.clone();

			// Modify the cloned employee's attributes
			clonedEmployee.setName("Jane Smith");
			clonedEmployee.setAge(28);
			clonedEmployee.setDepartment("HR");

			// Output the original and cloned employees
			System.out.println("Original Employee: " + originalEmployee);
			System.out.println("Cloned Employee: " + clonedEmployee);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
