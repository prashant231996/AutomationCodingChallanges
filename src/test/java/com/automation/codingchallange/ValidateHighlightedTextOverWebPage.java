package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateHighlightedTextOverWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act=new Actions(driver);
		WebElement startBtn=driver.findElement(By.name("start"));
		act.moveToElement(startBtn).build().perform();
		//Finding the colour and background colour of specific webelement
		System.out.println("Colour of webelement is "+startBtn.getCssValue("color"));
		System.out.println("Backgroud colour of webelement is "+startBtn.getCssValue("background-color"));
		//To verify webelemnt is highlighet we can use JavaScriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String highlightedText=(String)(js.executeScript("return window.getSelection().toString();"));
		Assert.assertEquals(highlightedText.toString(), startBtn.getText());
		driver.close();
	}

}
