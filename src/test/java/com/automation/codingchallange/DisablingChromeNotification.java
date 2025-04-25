package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisablingChromeNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Option 1 using Chrome options class 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("alertBtn")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		}
		catch(Exception exception)
		{
			Assert.assertTrue(true);
		}
		driver.close();
	}

}
