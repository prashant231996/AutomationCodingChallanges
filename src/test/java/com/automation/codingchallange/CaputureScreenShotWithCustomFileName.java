package com.automation.codingchallange;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaputureScreenShotWithCustomFileName {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
        getScreenShotWithCustomName(driver,"Automation_Practice_Snap");
        driver.close();
	}
	
	public static void getScreenShotWithCustomName(WebDriver driver,String customName)
	{
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"/screenShots/"+customName+".jpg"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
