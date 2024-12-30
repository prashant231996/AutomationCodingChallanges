package com.automation.codingchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollingDropdown {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		//JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://testautomationpractice.blogspot.com/");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Scrolling DropDown']")));
	    WebElement dropDownBox=driver.findElement(By.id("comboBox"));
	    dropDownBox.click();
	    List<WebElement>options=driver.findElements(By.xpath("//*[@id='dropdown']/div"));
	    String expectedValue="Item 39";
	    for(WebElement option:options)
	    {
	    	if(option.getText().equalsIgnoreCase(expectedValue))
	    	{
	    		option.click();
	    		break;
	    	}
	    }
	    driver.close();
	}

}
