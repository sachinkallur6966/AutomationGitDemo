package com.parabanks.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		System.out.println("Driver is " + driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "customer.firstName")
	WebElement fn;
	@FindBy(id = "customer.lastName")
	WebElement ln;
	@FindBy(id = "customer.address.street")
	WebElement address;
	@FindBy(id = "customer.address.city")
	WebElement city;
	@FindBy(id = "customer.address.state")
	WebElement state;
	@FindBy(id = "customer.phoneNumber")
	WebElement phone;
	@FindBy(id = "customer.ssn")
	WebElement ssn;
	@FindBy(id = "customer.address.zipCode")
	WebElement zip;
	@FindBy(id = "customer.username")
	WebElement userName;
	@FindBy(id = "customer.password")
	WebElement pwd;
	@FindBy(id = "repeatedPassword")
	WebElement rpwd;
	@FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement submit;
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
	WebElement msg;

	public void enterFirstName(String firstName) {
		fn.sendKeys(firstName);

	}

	public void enterLastName(String lastName) {
		ln.sendKeys(lastName);
	}

	public void enterStreet(String addr)

	{
		address.sendKeys(addr);
	}

	public void enterCity(String citi) {
		city.sendKeys(citi);
	}

	public void enterState(String State) {
		state.sendKeys(State);
	}

	public void enterzip(String Zip) {
		zip.sendKeys(Zip);
	}

	public void enterPhone(String Phone) {
		phone.sendKeys(Phone);
	}

	public void enterSsn(String SSn) {
		ssn.sendKeys(SSn);
	}

	public void enteruserName(String un) {
		userName.sendKeys(un);
	}

	public void enterPassword(String pass) {
		pwd.sendKeys(pass);
	}

	public void enterRpassword(String rpass) {
		rpwd.sendKeys(rpass);
	}

	public void clickOnRegister() {
		submit.submit();
	}

	public String getMsg() {
		String act = msg.getText();
		System.out.println("The Actual message is:" + act);
		String exp = "Your account was created successfully. You are now logged in.";
		Assert.assertEquals(act, exp);
		return act;
	}

}
