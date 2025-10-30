package com.SwagLabs.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginPage {
	private WebDriver driver;
	private By usern=By.id("user-name");
	private By pwd= By.id("password");
	private By lbtn= By.id("login-button");
	
	// initialize the driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle() {
	
		String title=driver.getTitle();
		Assert.assertTrue(driver.getTitle().contains(title));
		System.out.println("Test Passed  tile matched");
	}
	public void verifyUrl()
	{
		String act=driver.getCurrentUrl();
		System.out.println(act);
		String exp="https://www.saucedemo.com/";
		Assert.assertEquals(act, exp);
		System.out.println("Test Passed url matched");
	}
	 public void enterUserName(String un)
	 {
		 driver.findElement(usern).sendKeys(un);
	 }
	 public void enterPass(String password)
	 {
		 driver.findElement(pwd).sendKeys(password);
	 }
	 public void clickOnLogin()
	 {
		 driver.findElement(lbtn).click();
	 }
	
}
