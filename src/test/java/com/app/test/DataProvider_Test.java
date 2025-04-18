package com.app.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
	@Test(dataProvider = "test")
	public void test1(String data1,String data2,String data3) {
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
	}
	
	@DataProvider(name="test")
	public Object[][] dpmethod() {
		return new Object[][] {
			{"Aiite1","test1","Java1"},
			{"Aiite2","test2","Java2"}};
		
	}

}
