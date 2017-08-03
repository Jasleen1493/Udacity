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

public class RunningClass {

	private static final String FILE_PATH = "C:/Users/jasleen/Desktop/TMD/ImportNummers/updateTelephoneNumbers.xlsx";

	public static void main(String args[]) {
		List<List<String>> list = getListFromExcel();
		showExcelData(list);

	}

	@SuppressWarnings("deprecation")
	private static List<List<String>> getListFromExcel() {
		List<List<String>> list = new ArrayList<List<String>>();
		FileInputStream excelFile = null;

		try {
			excelFile = new FileInputStream(FILE_PATH);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				List<String> dataList = new ArrayList<String>();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					cell.setCellType(Cell.CELL_TYPE_STRING);
					dataList.add(cell.getStringCellValue());
				}
				list.add(dataList);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return list;
	}

	private static void showExcelData(List<List<String>> sheetData) {
		//
		// Iterates the data and print it out to the console.
		//
		for (List<String> list : sheetData) {
/*			System.out.println(
					"insert into [tmd].[dbo].[EMPLOYMENT_NUMBER_INFO] (PHONE_NUMBER,MITEL_NAME,LOCATION_CODE,PHONE_PROFILE,TRAFFIC_CLASS) values('"
							+ list.get(0) + "', '" + list.get(1) + "', '" + list.get(2) + "', '" + list.get(3) + "', '"
							+ list.get(4) + "');");*/
			/*System.out.println("update [tmd].[dbo].[EMPLOYMENT_NUMBER_INFO] set PHONE_NUMBER =  '"+list.get(0)+"', PHONE_PROFILE = '2a', TRAFFIC_CLASS = '3', MITEL_NAME = '"+list.get(1)+"', LOCATION_CODE = '"+list.get(2)+"', EXPORT_TO_CSV='1',SYNCHRONIZE_WITH_AD='1',SYNCHRONIZE_WITH_MCD='0',SYNCHRONIZE_WITH_RINGMASTER='1',FALLBACK=NULL where PERSONNEL_NUMBER='"+list.get(3)+"';");*/
			System.out.println("update [tmd].[dbo].[TELEPHONE_NUMBER] set IS_USED='1' where TELEPHONE_NUMBER='"+list.get(0)+"';");

		}
	}
}