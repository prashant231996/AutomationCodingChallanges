package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingIFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebDriverWait wait=new WebDriverWait(driver, 10);
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       WebElement frameHeader=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='iFrame Example']")));
	       js.executeScript("arguments[0].scrollIntoView()", frameHeader);
	       //Switching to frame using frame Id
	      // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("courses-iframe")));
	       driver.switchTo().frame("courses-iframe");
	       driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
	       //Switching back to parent window
	       driver.switchTo().defaultContent();
	       WebElement pageTitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Practice Page']")));
	       js.executeScript("arguments[0].scrollIntoView()", pageTitle);
	       driver.close();
	}

}
