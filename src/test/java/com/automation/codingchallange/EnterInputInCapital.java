package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterInputInCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement nameInput=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		//Entering input as capital letter
		//Approch 1
		//nameInput.sendKeys(Keys.SHIFT,"prashant");
		//Approch 2
		Actions action=new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(nameInput, "prashant").keyUp(Keys.SHIFT).build().perform();
		driver.quit();

	}

}
