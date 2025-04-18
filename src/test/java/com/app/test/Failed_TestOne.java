package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_TestOne {
	
		@Test(retryAnalyzer = FailedRetry_Logic.class)
		public void test1() {
			// hardAssert -> if Assertion failed the method will terminate
			String s = "Aiite";
			Assert.assertEquals(s, "Aiit");
			System.out.println("test1");
		}
		
		@Test
		public void user() {
			System.out.println("user");
		}
		
		@Test 
		public void pass() {
			System.out.println("pass");
		}
		
		@Test
		public void login() {
			System.out.println("login");
		}
}
