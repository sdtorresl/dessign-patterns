package co.edu.unisabana.solid.data;

import co.edu.unisabana.solid.repository.EmployeeManager;

public interface IReportGenerator {
    void generateReportExcel(EmployeeManager employeeManager);

    void generateReportPDF(EmployeeManager employeeManager);
}
