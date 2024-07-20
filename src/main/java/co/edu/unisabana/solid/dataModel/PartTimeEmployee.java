package co.edu.unisabana.solid.dataModel;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int id, String name, String department, double baseSalary) {
        super(id, name, department, baseSalary);
    }

    @Override
    public int getHoursPerDay() {
        return 4;
    }
}
