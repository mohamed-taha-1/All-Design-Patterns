package designPatterns.structural.composite.example2;

public class Employee implements OrganizationComponent {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void display() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }

}
