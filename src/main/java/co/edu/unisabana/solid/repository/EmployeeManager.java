package co.edu.unisabana.solid.repository;

import co.edu.unisabana.solid.dataModel.Employee;
import co.edu.unisabana.solid.data.IEmployeeDB;

import java.util.Optional;

public class EmployeeManager implements EmployeeOperations {
    final IEmployeeDB employeeDB;

    public EmployeeManager(IEmployeeDB employeeDB) {
        this.employeeDB = employeeDB;
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employeeDB.addEmployee(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        this.employeeDB.removeEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = this.employeeDB.getEmployees().stream().filter(e -> e.getId() == id).findFirst();
        return employee.orElse(null);
    }
}
