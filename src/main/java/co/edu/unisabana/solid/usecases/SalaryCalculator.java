package co.edu.unisabana.solid.usecases;

import co.edu.unisabana.solid.dataModel.Employee;
import co.edu.unisabana.solid.repository.EmployeeManager;

public class SalaryCalculator {
    private final EmployeeManager employeeManager;

    public SalaryCalculator(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public double calculateSalary(int id) {
        Employee emp = employeeManager.getEmployeeById(id);
        return emp.getBaseSalary() * emp.getHoursPerDay() * 20;
    }
}
