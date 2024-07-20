package co.edu.unisabana.solid;

public class Employee {

    private final String name;
    private final String department;

    public Employee(String name, String department) {
        this.department = department;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
