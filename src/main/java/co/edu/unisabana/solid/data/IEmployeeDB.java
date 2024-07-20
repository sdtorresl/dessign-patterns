package co.edu.unisabana.solid.data;

import co.edu.unisabana.solid.dataModel.Employee;

import java.util.List;

public interface IEmployeeDB {
    void addEmployee(Employee employee);

    List<Employee> getEmployees();

    void removeEmployee(Employee employee);
}
