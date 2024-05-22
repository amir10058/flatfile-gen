package com.neurogine.flatfilereportgen;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JasperReportGenerator {

    public static void main(String[] args) {
        try {
            // Generate data
            List<Body> data = Main.generateData();

            // Create data source
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(data);

            // Compile the Jasper report from .jrxml to .jasper
            JasperReport jasperReport = JasperCompileManager.compileReport("src/main/resources/SampleReport.jrxml");

            // Parameters for the report
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("ReportTitle", "Sample Report");

            // Fill the report with data source objects
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

            // Export the report to PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "SampleReport.pdf");

        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}