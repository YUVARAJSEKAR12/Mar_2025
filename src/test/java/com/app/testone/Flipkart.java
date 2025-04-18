package com.app.testone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.flipkart.com/offers-list/top-offers?screen=dynamic&pk=themeViews%3DBBDH-LS-DT-Top-offers-OMU1%3ADT-OMU~widgetType%3DdealCard~contentType%3Dneo");

		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		men.click();
		Thread.sleep(2000);
		WebElement Watches = driver.findElement(By.xpath("//a[@title='Watches']"));
		Watches.click();
		Thread.sleep(3000);

		Thread.sleep(5000);
		String prantName = "Fastrack";
		switch (prantName) {
		case "Fastrack":
			WebElement fastrackFilter = driver.findElement(By.xpath("//div[text()='Fastrack']"));
			fastrackFilter.click();
			Thread.sleep(5000);
			break;
		case "Casio":
			WebElement casio = driver.findElement(By.xpath("//a[text()='Casio']"));
			casio.click();
			Thread.sleep(5000);
			break;
		case "Titan":
			WebElement titan = driver.findElement(By.xpath("//a[text()='Titan']"));
			titan.click();
			Thread.sleep(5000);
			break;
		case "Fossil":
			WebElement fossil = driver.findElement(By.xpath("//a[text()='Fossil']"));
			fossil.click();
			Thread.sleep(5000);
			break;

		default:
			break;
		}


		List<WebElement> watchNames = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		List<WebElement> watchPrices = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));

		Map<String, String> watchMap = new HashMap<>();
		for (int i = 0; i < watchNames.size(); i++) {
			String name = watchNames.get(i).getText();
			String price = watchPrices.get(i).getText();
			watchMap.put(name, price);
		}

		for (Map.Entry<String, String> entry : watchMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}
}