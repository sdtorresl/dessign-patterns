package co.edu.unisabana.solid;

import co.edu.unisabana.solid.data.EmployeeDB;
import co.edu.unisabana.solid.repository.ExcelReportGenerator;
import co.edu.unisabana.solid.repository.PDFReportGenerator;
import co.edu.unisabana.solid.dataModel.Employee;
import co.edu.unisabana.solid.dataModel.PartTimeEmployee;
import co.edu.unisabana.solid.repository.EmployeeManager;
import co.edu.unisabana.solid.usecases.ReportGenerator;
import co.edu.unisabana.solid.usecases.SalaryCalculator;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Juan", "Contabilidad", 30000);
        Employee employee2 = new PartTimeEmployee(2, "Alejandra", "Contabilidad", 30000);
        Employee employee3 = new Employee(3, "Miguel", "IT", 90000);
        Employee employee4 = new PartTimeEmployee(4, "Juliana", "HR", 75000);

        EmployeeManager employeeManager = new EmployeeManager(EmployeeDB.getInstance());
        SalaryCalculator calculator = new SalaryCalculator(employeeManager);

        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);
        employeeManager.addEmployee(employee3);
        employeeManager.addEmployee(employee4);

        employeeManager.getEmployees().forEach(employee -> {
                    double salary = calculator.calculateSalary(employee.getId());
                    System.out.println("The salary " + employee.getName() + " is: " + salary);

                }
        );

        ReportGenerator excelReportService = new ReportGenerator(new ExcelReportGenerator());
        excelReportService.generateReport(employeeManager);

        ReportGenerator pdfReportService = new ReportGenerator(new PDFReportGenerator());
        pdfReportService.generateReport(employeeManager);

    }
}
