package com.automation.codingchallange;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Fluent Wait declaration
		Wait<WebDriver>fluentWait=new FluentWait<WebDriver>(driver)
				                  .withTimeout(Duration.ofSeconds(10))
				                  .pollingEvery(Duration.ofSeconds(2))
				                  .ignoring(NoSuchElementException.class);
		
		//Function to apply flueent wait while finding webelement		
		WebElement nameInputBox=fluentWait.until((WebDriver)->
		{
	             return driver.findElement(By.id("name"));
		});
		
		nameInputBox.sendKeys("Prashant Shivaji More");
		driver.close();
	}

}
