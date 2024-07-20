package co.edu.unisabana.solid.data;

import co.edu.unisabana.solid.repository.EmployeeManager;

public class ReportGenerator implements IReportGenerator {

    @Override
    public void generateReportExcel(EmployeeManager employeeManager) {
        System.out.println("El reporte se ha generado en excel");
    }

    @Override
    public void generateReportPDF(EmployeeManager employeeManager) {
        System.out.println("El reporte se ha generado en PDF");
    }
}
