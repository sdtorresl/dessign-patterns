package co.edu.unisabana.solid.usecases;

import co.edu.unisabana.solid.data.IReportGenerator;
import co.edu.unisabana.solid.repository.EmployeeManager;


public class ReportGenerator {

    private final IReportGenerator reportGenerator;

    public ReportGenerator(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport(EmployeeManager employeeManager) {
        reportGenerator.generateReport(employeeManager);
    }
}