package co.edu.unisabana.solid;

public class SalaryCalculator {

    public double calculateSalary(String name) {
        EmployeeManager employeeManager = new EmployeeManager();
        return employeeManager.calculateSalary(name);
    }
}
