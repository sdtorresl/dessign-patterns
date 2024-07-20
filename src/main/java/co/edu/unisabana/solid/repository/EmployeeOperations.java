package co.edu.unisabana.solid.repository;

import co.edu.unisabana.solid.dataModel.Employee;

public interface EmployeeOperations {
    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    Employee getEmployeeById(int id);
}
