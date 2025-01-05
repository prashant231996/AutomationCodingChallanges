package com.automation.codingchallange;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.taskdefs.Java;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdownAndStaticWebTableAssignement {

	public static void main(String args[]) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		WebElement departureCityEle=driver.findElement(By.name("fromPort"));
		Select departureCityDropDown=new Select(departureCityEle);
		departureCityDropDown.selectByVisibleText("Boston");
		WebElement destinationCityEle=driver.findElement(By.name("toPort"));
		Select destinationCityDropdown=new Select(destinationCityEle);
		destinationCityDropdown.selectByVisibleText("Berlin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Flights from')]")));
		List<WebElement>rows=driver.findElements(By.xpath("//table//tbody/tr"));
		double minPrice=9999999.99;
		List<Double>prices=new ArrayList<Double>();
		int index=0;
		for(WebElement row:rows)
		{
		    List<WebElement>columns=row.findElements(By.tagName("td"));
		    String priceText=(columns.get(columns.size()-1).getText());
		    priceText=priceText.substring(1,priceText.length());
		    double price=Double.parseDouble(priceText);
		    prices.add(price); 
		    if(price<minPrice)
		    {
		    	minPrice=price;
		    	index=prices.indexOf(price);
		    }
		}
		System.out.println("Minimum price is "+minPrice);
		System.out.println("Index of minimum price is "+index);
		WebElement lowestFlightChooseBtn=rows.get(index).findElements(By.tagName("td")).get(0);
	    lowestFlightChooseBtn.findElement(By.tagName("input")).click();
		Thread.sleep(3000);
		//Creating javascript executor object to scrolling down to the respective webelement
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//input[@value='Purchase Flight']")));
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		//Asserting confirmation message
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Thank you for your purchase today!']")));
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Thank you for your purchase today!']")).isDisplayed());
        //Closing currant browser which in focus..
		driver.close();
	}

}
