package com.automation.codingchallange;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterTextUsingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Launching chrome browser
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Launching or navigating to url
		driver .get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBtn"))).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Prashant");
		alert.accept();
		WebElement promptBtn=driver.findElement(By.id("promptBtn"));
		js.executeScript("arguments[0].scrollIntoView()", promptBtn);
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello Prashant! How are you today?']"))).isDisplayed());
	}

}
