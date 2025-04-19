package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//sample test one fetch
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	
	public static void inputText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	
	public static void dropDown(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		
	}
	
	public static String excelData_reuse(int i, int j) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new"
					+ "\\oct\\Mar_2025\\src\\test\\resources\\TestData\\Mar_project.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			// System.out.println(cell);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					// System.out.println(dateCellValue);
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value = sm.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	public static String readprop_reuse(String data) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
					+ "\\new\\oct\\Mar_2025\\src\\test\\resources\\TestData\\config.properties");
		
		FileReader read = new FileReader(f);
		Properties prop = new Properties();
		prop.load(read);
		value= prop.getProperty(data);
		System.out.println(value);	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return value;	
}
	
	@AfterClass
	public static void getScreenshot() {
		// get screen shot method
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File desitnation = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\Mar_2025\\ScreenShot\\AdactinPage.jpg");
			FileHandler.copy(screenshotAs, desitnation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
