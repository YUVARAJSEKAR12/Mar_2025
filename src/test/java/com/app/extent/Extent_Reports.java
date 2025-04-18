package com.app.extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Reports {
	public static ExtentSparkReporter spExe = null;
	public static ExtentReports exerepo  = null;
	public static ExtentTest exeTest=null;
	public static String reportLocation 
	                =System.getProperty("user.dir")+"/reports/test.html";
	
	
	public static ExtentReports getInstance() {
		if(exerepo==null) {
			return createInstance();
		}
		return exerepo;
	}
	
	public static ExtentReports createInstance() {
		spExe = new ExtentSparkReporter(reportLocation);
		spExe.config().setDocumentTitle("AiiteTest");
		spExe.config().setTheme(Theme.DARK);
		spExe.config().setReportName("Aiite Extent Reports");
		exerepo = new ExtentReports();
		exerepo.attachReporter(spExe);
		exerepo.setSystemInfo("Citi", "Cards");
		exerepo.setSystemInfo("Card", "IndianOil");
		exerepo.setSystemInfo("CardType", "Visa");
		return exerepo;
	}
	
	public static void createTest(String name) {
		exeTest = exerepo.createTest(name);
	}
	
	public static void flushreport() {
		exerepo.flush();
	}
	
	
	
}
