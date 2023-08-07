package designPatterns.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
	private String name;
	private List<OrganizationComponent> components;

	public Department(String name) {
		this.name = name;
		this.components = new ArrayList<>();
	}

	public void addComponent(OrganizationComponent component) {
		components.add(component);
	}

	public void removeComponent(OrganizationComponent component) {
		components.remove(component);
	}

	@Override
	public void display() {
		System.out.println("Department: " + name);
		for (OrganizationComponent component : components) {
			component.display();
		}
	}

}
