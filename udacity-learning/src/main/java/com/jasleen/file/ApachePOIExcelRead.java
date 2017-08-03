package com.jasleen.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIExcelRead {
	public static void main(String[] args) {
		String filePath = "C://Users//jasleen//Desktop//Book1.xlsx";
		List sheetData = new ArrayList<>();
		try {
			FileInputStream excelFile = new FileInputStream(new File(filePath));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet dataSheet = workbook.getSheetAt(0);
			
			Iterator<Row> rows = dataSheet.rowIterator();
			while (rows.hasNext()) {
				Row currentRow = rows.next();
				Iterator<Cell> cells = currentRow.cellIterator();
				List<Cell> data = new ArrayList<Cell>();
				while (cells.hasNext()) {
					Cell currentCell = cells.next();
					data.add(currentCell);
					}
				sheetData.add(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	      showExelData(sheetData);
	    }

	    private static void showExelData(List sheetData) {
	        //
	        // Iterates the data and print it out to the console.
	        //
	        for (int i = 0; i < sheetData.size(); i++) {
	            List list = (List) sheetData.get(i);
	            for (int j = 0; j < list.size(); j++) {
	                Cell cell = (Cell) list.get(j);
	               // if(cell.getCellType() == )
	                System.out.print(cell.getRichStringCellValue().getString());
	                if (j < list.size() - 1) {
	                    System.out.println(", ");
	                }
	            }
	            System.out.println("");
	        }
	    }
	}
