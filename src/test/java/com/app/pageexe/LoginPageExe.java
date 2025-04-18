package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.BookAHotelLocator;
import com.app.locator.LoginPageLocator;

public class LoginPageExe extends BookAHotelLocator {
	
	public static void username() {
		//LoginPageLocator l = new LoginPageLocator();
		BaseClass.inputText(new LoginPageLocator().getUsername(), "Aiite");
	}
	
	public static void password() {
		//LoginPageLocator l = new LoginPageLocator();
		BaseClass.inputText(new LoginPageLocator().getPassword(), "Aiite");
	}

	public static void login() {
		//LoginPageLocator l = new LoginPageLocator();
		BaseClass.buttonClick(new LoginPageLocator().getLogin());
	}

}
