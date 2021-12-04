package com.duckafilla.automation.foodchain.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
		String fileName ="C:\\Users\\navee\\Trainings\\foodchain\\Data\\TestDataAutomation.xlsx";
		String sheetName = "Data";

		public String getCellData(int rowNum, int cellNum) throws IOException {
			// 1. File reading
			FileInputStream file = new FileInputStream(fileName);
			// 2. Excel Workbook reading
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			// 3. Excel Sheet
			XSSFSheet sheet = workbook.getSheet(sheetName);
			System.out.println(" Excel Sheet " + sheet);
			XSSFCell cell = sheet.getRow(rowNum).getCell(cellNum);
			System.out.println(" Cell Value " + cell.getStringCellValue());
			return cell.getStringCellValue();

		}

		public Object[][] getCellData() throws IOException {
			// 1. File reading
			FileInputStream file = new FileInputStream(fileName);
			// 2. Excel Workbook reading
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			// 3. Excel Sheet
			XSSFSheet sheet = workbook.getSheet(sheetName);
			System.out.println(" Excel Sheet " + sheet);
			/*
			 * Iterator rowIterator = sheet.rowIterator(); Row rowValue = (Row)
			 * rowIterator.next();
			 */
			int totalRow = sheet.getLastRowNum();
			System.out.println(" Total Rows " + totalRow);
			 int totalCols = sheet.getRow(0).getLastCellNum();
			// System.out.println(" Total Cols "+ totalCols);
			String[][] cellValue = new String[totalRow][totalCols];
			for (int i = 0; i < totalRow; i++) {
				for(int j=0;j<totalCols;j++) {
				cellValue[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
			System.out.println(" Cell Value " + cellValue);
			return cellValue;
		}

		public static void main(String[] args) throws IOException {
			/*
			 * // 1. File reading FileInputStream file = new FileInputStream(
			 * "C:\\Users\\navee\\OneDrive\\Documents\\GitHub\\MavenSelenium\\Data\\TestData.xlsx"
			 * ); // 2. Excel Workbook reading XSSFWorkbook workbook = new
			 * XSSFWorkbook(file); // 3. Excel Sheet XSSFSheet sheet =
			 * workbook.getSheet("SheetData"); System.out.println(" Excel Sheet " + sheet);
			 * XSSFCell cell = sheet.getRow(2).getCell(0); System.out.println(" Cell Value "
			 * + cell.getStringCellValue());
			 */
			ReadExcel reader = new ReadExcel();
			reader.getCellData(3, 0);

		}

}
