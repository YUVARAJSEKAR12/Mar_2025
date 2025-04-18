package com.app.extent;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {

	public static final Logger logger = LogManager.getLogger(TestOne.class);
	
	@Test
	public void user() {
		logger.info("user");
		Assert.assertTrue(false);
		System.out.println("testOne");
	}
	
	@Test 
	public void pass() {
		logger.info("pass");
		System.out.println("testtwo");
	}
	
	@Test
	public void login() {
		logger.info("login");
		System.out.println("testthree");
	}
	
}
