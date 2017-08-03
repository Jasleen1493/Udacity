package com.jasleen.jasper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FlightJasperMain {

	public static void main(String[] args) throws Exception {
		
		Flight flight = new Flight();
		flight.setAirCraftType("737-800");
		
			JasperCompileManager.compileReportToFile("C:\\Users\\jasleen\\Desktop\\flight_Pdf\\pdfReportCFR.jrxml","pdfReportCFR.jasper");
			/*	   JasperReport report1 = (JasperReport) JRLoader
				     .loadObjectFromFile("pdfReportCFR.jasper");
				   JasperPrint jasperPrint1 = JasperFillManager.fillReport(report1,
				     new HashMap<String, Object>(),
				     new JRBeanCollectionDataSource(graphDtoList));*/
			JasperReport report1 = (JasperReport) JRLoader
				    .loadObjectFromFile("pdfReportCFR.jasper");
			
				  List<Flight> flightDetails=new ArrayList<Flight>();
				  flightDetails.add(flight);
			JasperPrint jasperPrint1 = JasperFillManager.fillReport(report1,new HashMap<String, Object>(),new 			JRBeanCollectionDataSource(flightDetails));
			   JasperViewer.viewReport(jasperPrint1, true);
			   JRExporter exporter = new JRPdfExporter();
			   List<JasperPrint> jprintlist = new ArrayList<JasperPrint>();
			   jprintlist.add(jasperPrint1);
			   exporter.setParameter(JRPdfExporterParameter.JASPER_PRINT_LIST,
			     jprintlist);

			   OutputStream output = new FileOutputStream(new File( "jasleen.pdf"));

			   exporter.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, output);
			   exporter.exportReport();

			   System.out.println("flightDetails.pdf  generated!");
			
			
		}
}
