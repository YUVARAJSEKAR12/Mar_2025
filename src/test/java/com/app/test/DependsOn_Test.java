package com.app.test;

import org.testng.annotations.Test;

public class DependsOn_Test {
	@Test
	public void user() {
		System.out.println("user");
	}
	
	@Test (dependsOnMethods = "user")
	public void pass() {
		System.out.println("pass");
	}
}
