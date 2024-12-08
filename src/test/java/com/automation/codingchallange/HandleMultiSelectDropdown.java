package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultiSelectDropdown {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement colourLabel=driver.findElement(By.xpath("//label[contains(text(),\"Colors\")]"));
		js.executeScript("arguments[0].scrollIntoView()", colourLabel);
		WebElement colorElement=driver.findElement(By.id("colors"));
		Select colordropDownElement=new Select(colorElement);
		//Selecting multiple options from drop down
		colordropDownElement.selectByValue("red");
		colordropDownElement.selectByValue("yellow");
		//Verifying that both the colors has been selected
		for(WebElement option:colordropDownElement.getOptions())
		{
			if(option.getText().equalsIgnoreCase("Red") || option.getText().equalsIgnoreCase("Yellow"))
			{
				Assert.assertTrue(option.isSelected());
				System.out.println("Validation passed successfully..");
			}
		}
		driver.close();
	}

}
