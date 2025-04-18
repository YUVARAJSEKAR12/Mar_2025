package com.app.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramter_Test {
	
	@Parameters({"username"})
	@Test
	public void user(String user) {
		System.out.println(user);
	}

	@Parameters({"password"})
	@Test
	public void pass(String pass) {
		System.out.println(pass);
	}

	@Test
	public void login() {
		System.out.println("login");
	}

}
