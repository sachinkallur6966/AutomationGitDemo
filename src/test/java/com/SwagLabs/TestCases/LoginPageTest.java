package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

import com.SwagLabs.Pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test(priority = 1)
	public void validateTitle() {

		lp.verifyTitle();
	}

	@Test(priority = 2)
	public void validatUrl() {

		lp.verifyUrl();
	}

	@Test(priority = 3)
	public void validateUsername() {
		lp.enterUserName("standard_user");

	}

	@Test(priority = 4)
	public void validatePass() {
		lp.enterPass("secret_sauce");
	}

	@Test(priority = 5)
	public void validatelogin() {
		lp.clickOnLogin();
	}
}
