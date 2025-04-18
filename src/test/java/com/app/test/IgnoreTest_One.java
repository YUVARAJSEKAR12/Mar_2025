package com.app.test;

import org.testng.annotations.Test;

public class IgnoreTest_One {
	
	
	@Test(enabled = false)
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
