package com.parabank.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.parabanks.Pages.RegistrationPage;

public class BaseTestForRegistrationPage {
	WebDriver driver;
	RegistrationPage rp;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		rp = new RegistrationPage(driver);
	}

}
