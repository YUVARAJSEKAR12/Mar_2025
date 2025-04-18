package com.app.testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("--headless");
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://adactinhotelapp.com/");
		System.out.println(driver.getTitle());
	}

}
