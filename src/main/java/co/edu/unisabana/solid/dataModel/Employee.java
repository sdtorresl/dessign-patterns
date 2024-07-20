package co.edu.unisabana.solid.dataModel;

public class Employee {

    private final int id;
    private final String name;
    private final String department;
    private final double baseSalary;

    public Employee(int id, String name, String department, double baseSalary) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getHoursPerDay() {
        return 8;
    }
}
