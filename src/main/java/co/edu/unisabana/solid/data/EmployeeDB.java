package co.edu.unisabana.solid.data;

import co.edu.unisabana.solid.dataModel.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB implements IEmployeeDB {
    private final List<Employee> employees = new ArrayList<>();
    private static EmployeeDB instance;

    private EmployeeDB() {}

    public static EmployeeDB getInstance() {
        if(instance == null) {
            instance = new EmployeeDB();
        }
        return instance;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
