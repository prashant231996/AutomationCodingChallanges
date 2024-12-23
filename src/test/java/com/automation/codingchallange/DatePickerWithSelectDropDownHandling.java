package com.automation.codingchallange;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerWithSelectDropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
	    Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
	    		        .withTimeout(Duration.ofSeconds(10))
	    		        .pollingEvery(Duration.ofSeconds(3))
	    		        .ignoring(NoSuchElementException.class);
	    driver.findElement(By.id("txtDate")).click();
	    //Select a year
	    String expectedYear="2025";
	    Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	    yearDropdown.selectByVisibleText(expectedYear);
	    //Select a month
	    String expectedMonth="Oct";
	    Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	    monthDropdown.selectByVisibleText(expectedMonth);
	    //Select a date
	    String expectedDate="23";
	    List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));
	    for(int i=0;i<dates.size();i++)
	    {
	    	if(dates.get(i).getText().equalsIgnoreCase(expectedDate))
	    	{
	    		dates.get(i).click();
	    		break;
	    	}
	    }
	    
	}

}
