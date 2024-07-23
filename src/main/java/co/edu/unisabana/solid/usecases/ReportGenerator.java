package co.edu.unisabana.solid.data;

import co.edu.unisabana.solid.repository.EmployeeManager;


public class ReportGenerator {

    private final IReportGenerator reportGenerator;

    public ReportService(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport(EmployeeManager employeeManager) {
        reportGenerator.generateReport(employeeManager);
    }
}