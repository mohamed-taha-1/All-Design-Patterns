package designPatterns.structural.composite;

import designPatterns.structural.composite.example1.Directory;
import designPatterns.structural.composite.example1.File;
import designPatterns.structural.composite.example2.Department;
import designPatterns.structural.composite.example2.Employee;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> it allow us to group objects in tree like structure and interact with
		 * objects like a single one
		 * 
		 * <T> it uses to create a unified interface for individual objects and
		 * compositions, enabling clients to interact with them in a consistent manner.
		 * 
		 * 
		 **/

		File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Directory subDirectory = new Directory("Subdirectory");
        subDirectory.addComponent(file2);
        subDirectory.addComponent(file3);
        subDirectory.display();

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(file1);
        rootDirectory.addComponent(subDirectory);
        rootDirectory.display();
        
        System.out.println("\n\n*************");
        
        //Example-2  
        Employee employee1 = new Employee("John Smith", "Manager");
        Employee employee2 = new Employee("Jane Doe", "Developer");
        Employee employee3 = new Employee("Mike Johnson", "Designer");

        Department developmentDepartment = new Department("Development");
        developmentDepartment.addComponent(employee2);
        developmentDepartment.addComponent(employee3);

        Department rootDepartment = new Department("Root");
        rootDepartment.addComponent(employee1);
        rootDepartment.addComponent(developmentDepartment);

        rootDepartment.display();
	}

}
