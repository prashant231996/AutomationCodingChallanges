package com.automation.codingchallange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Creating actions class object
		Actions act=new Actions(driver);
		WebElement buttonEle=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(buttonEle).build().perform();
		String actualText=driver.findElement(By.id("field2")).getText();
		Assert.assertEquals(actualText,"");
		
	}

}
