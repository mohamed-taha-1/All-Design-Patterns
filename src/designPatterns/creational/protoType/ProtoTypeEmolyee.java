package designPatterns.creational.protoType;

public class ProtoTypeEmolyee implements Cloneable {

	private String name;
	private int age;
	private String department;

	public ProtoTypeEmolyee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	 @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", department='" + department + '\'' +
	                '}';
	    }
	
	
	@Override
    public ProtoTypeEmolyee clone() throws CloneNotSupportedException {
        return (ProtoTypeEmolyee) super.clone();
    }
}