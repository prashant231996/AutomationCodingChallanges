package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

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

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://testautomationpractice.blogspot.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebDriverWait wait=new WebDriverWait(driver, 10);
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       WebElement alertTitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Alerts & Popups']")));
	       js.executeScript("arguments[0].scrollIntoView()", alertTitle);
	       //Handling simple alert
	       driver.findElement(By.id("alertBtn")).click();
	       Alert alert=driver.switchTo().alert();
	       alert.accept();
	       Thread.sleep(2000);
	       //Handling confirmation alert
	       driver.findElement(By.id("confirmBtn")).click();
	       alert=driver.switchTo().alert();
	       alert.dismiss();
	       Assert.assertTrue(driver.findElement(By.xpath("//*[text()='You pressed Cancel!']")).isDisplayed());
	       Thread.sleep(2000);
	       //Handling prompt alert
	       driver.findElement(By.id("promptBtn")).click();
	       alert=driver.switchTo().alert();
	       alert.sendKeys("Prashant");
	       alert.accept();
	       Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Hello Prashant! How are you today?']")).isDisplayed());
	       
	       driver.close();
	}

}
