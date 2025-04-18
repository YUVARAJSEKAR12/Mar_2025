package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation_One {

	
	// assertEquals,assertTrue,assertFalse, assertNotNull,assertNull
	@Test
	public void test1() {
		// hardAssert -> if Assertion failed the method will terminate
		String s = "Aiite";
		Assert.assertEquals(s, "Aiit");
		System.out.println("test1");
	}
	
	@Test 
	public void test2() {
		//softASSERT -> if Assertion failed the method will the execute the remaining line of codes
		String s = "Aiite";
		SoftAssert sf = new SoftAssert();
		sf.assertAll();
		sf.assertEquals(s, "Aiit");
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
}
