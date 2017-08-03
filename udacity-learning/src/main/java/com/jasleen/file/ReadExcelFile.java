package com.jasleen.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	private static final String FILE_PATH = "C://Users//jasleen//Desktop//Book1.xlsx";

	public static void main(String args[]) {
		List list = getStudentsListFromExcel();
		System.out.println("List : " +list+ ",");
		showExcelData(list);
		
	}

	private static List getStudentsListFromExcel() {
		List list = new ArrayList();
		FileInputStream excelFile = null;
		List dataList = new ArrayList();
		try {
			excelFile = new FileInputStream(FILE_PATH);
						Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()){
					if(cellIterator.next().getCellType() ==  cellIterator.next().CELL_TYPE_STRING){
					dataList.add(cellIterator.next().getStringCellValue());
					}
					else if (cellIterator.next().getCellType() ==  cellIterator.next().CELL_TYPE_NUMERIC){
						dataList.add(cellIterator.next().getNumericCellValue());
					}
			}
				}
			list.add(dataList);
			System.out.println(list);
		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}


private static void showExcelData(List sheetData) {
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
