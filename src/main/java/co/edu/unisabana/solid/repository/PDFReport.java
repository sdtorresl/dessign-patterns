package co.edu.unisabana.solid.data;

public class PDFReportGenerator implements IReportGenerator {

    @Override
    public void generateReport(EmployeeManager employeeManager) {
        System.out.println("El reporte se ha generado en PDF");
       
    }
}
