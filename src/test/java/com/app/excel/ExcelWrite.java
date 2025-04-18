package com.app.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) {
		excelModify();
	}
	public static void excelWrite() {

		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\Mar_2025"
					+ "\\src\\test\\resources\\TestData\\Mar_project.xlsx");
			// file read
			FileInputStream fis = new FileInputStream(f);
			// workBook
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.createSheet("Aiite");
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("Java");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void excelModify() {

		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\Mar_2025"
					+ "\\src\\test\\resources\\TestData\\Mar_project.xlsx");
			// file read
			FileInputStream fis = new FileInputStream(f);
			// workBook
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Aiite");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			if(cell.getStringCellValue().equals("Java")) {
				cell.setCellValue("Selenium");	
			}
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
