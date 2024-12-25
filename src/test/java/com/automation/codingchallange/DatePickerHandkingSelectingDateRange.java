package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerHandkingSelectingDateRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		//Selecting dates between range
		//Selecting start date
		driver.findElement(By.id("start-date")).sendKeys("10231996");
		//Selecting end date
		driver.findElement(By.id("end-date")).sendKeys("12252024");
		//Clicking on submit button
		driver.findElement(By.className("submit-btn")).click();
        //Checking the respective result
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("result")))).isDisplayed());
	}

}
