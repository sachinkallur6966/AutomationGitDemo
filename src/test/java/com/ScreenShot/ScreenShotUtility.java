package com.ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {

	public static void getScreenShot(WebDriver driver)
	
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "\\ScreenShot\\Test" + System.currentTimeMillis() + ".png");
        FileHandler.copy(temp, dest);

		)
	}
}

