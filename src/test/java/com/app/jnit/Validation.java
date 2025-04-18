package com.app.jnit;

import org.junit.Assert;
import org.junit.Test;

public class Validation {

	@Test
	public void user() {
		String s = "Aiite";
		Assert.assertEquals(s, "Aiite");
		System.out.println("user");
	}

	@Test
	public void pass() {
		String s = "Aiite";
		Assert.assertTrue(s.contains("Aii"));
		System.out.println("pass");
	}

	@Test
	public void login() {
		String s = "Aiite";
		Assert.assertFalse(s.contains("aiite"));
		System.out.println("login");
	}

	@Test
	public void test4() {
		System.out.println("test4");
	}

	@Test
	public void test5() {
		System.out.println("test5");
	}

}
