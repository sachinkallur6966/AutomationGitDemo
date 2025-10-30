package com.parabank.TestCases;

import org.testng.annotations.Test;

public class RegistrationPageValidation extends BaseTestForRegistrationPage {

	@Test
	public void validateRegsitrationPage() {
		rp.enterFirstName("Raj");
		rp.enterLastName("ShriGiri");
		rp.enterStreet("Chittapur");
		rp.enterState("Karnataka");
		rp.enterCity("Gulburga");
		rp.enterzip("585113");
		rp.enterPhone("9741972041");
		rp.enterSsn("14322");
		rp.enteruserName("Raj Shr");
		rp.enterPassword("Raj@123");
		rp.enterRpassword("Raj@123");
		rp.clickOnRegister();
		String act = rp.getMsg();
		System.out.println("The Actual message is:" + act);

	}
}
