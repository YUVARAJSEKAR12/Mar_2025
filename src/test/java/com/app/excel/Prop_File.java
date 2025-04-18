package com.app.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prop_File {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver c = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		WebElement element = driver.findElement(By.id("username"));
		
		
	}

	public static void prop_read() {

		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\Mar_2025"
					+ "\\src\\test\\resources\\TestData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			String username = prop.getProperty("username");
			System.out.println(username);
			String password = prop.getProperty("password");
			System.out.println(password);
			System.out.println(prop.getProperty("url"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String prop_reuse(String data) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\Mar_2025"
					+ "\\src\\test\\resources\\TestData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
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

}
