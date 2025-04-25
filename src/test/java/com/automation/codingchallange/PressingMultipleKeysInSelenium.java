package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PressingMultipleKeysInSelenium {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Approch 1
//		driver.findElement(By.id("name")).sendKeys(Keys.SHIFT,"prashant More");
//		driver.findElement(By.id("name")).sendKeys(Keys.CONTROL,"a");
//		driver.findElement(By.id("name")).sendKeys(Keys.CONTROL,"c");
//		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL,"v");
		//Approch 2
		Actions act=new Actions(driver);
		WebElement nameEle=driver.findElement(By.id("name"));
		act.keyDown(nameEle,Keys.SHIFT).sendKeys("prashant").keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("a")
		.keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement emailField=driver.findElement(By.id("email"));
		act.keyDown(emailField,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
