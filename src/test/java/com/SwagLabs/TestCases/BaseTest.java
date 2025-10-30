package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.LoginPage;

public class BaseTest {
	public WebDriver driver ;
	LoginPage lp ;
  @BeforeTest
  public void setUp() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.saucedemo.com/");
	  lp= new LoginPage(driver);	
	  System.out.println("Driver address in BaseTest is"+driver);

  }
}
