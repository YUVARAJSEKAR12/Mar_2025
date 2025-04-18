package com.app.test;

import org.testng.annotations.Test;

public class TestCaseGroup1 {
	@Test(groups = { "smoke","reg" })
	public void user() {
		System.out.println("user");
	}

	@Test(groups = { "sanity","reg" })
	public void pass() {
		System.out.println("pass");
	}

	@Test(groups = { "smoke","reg"})
	public void login() {
		System.out.println("login");
	}
}
