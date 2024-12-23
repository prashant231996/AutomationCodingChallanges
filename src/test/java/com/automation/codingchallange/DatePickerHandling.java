package com.automation.codingchallange;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerHandling {
	
	//User Defined method for converting month from string-->Month
	public static Month convertMonth(String month)
	{
		HashMap<String, Month>monthMap=new HashMap<String,Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February",Month.FEBRUARY);
		monthMap.put("March",Month.MARCH);
		monthMap.put("April",Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June",Month.JUNE);
		monthMap.put("July",Month.JULY);
		monthMap.put("August",Month.AUGUST);
		monthMap.put("September",Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November",Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month monthVal=monthMap.get(month);
		
		if(monthVal==null)
		{
			System.out.println("Invalid Month...");
		}
		return monthVal;
	}
	
	public static void main(String args[])
	{
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
	   driver.findElement(By.id("datepicker")).click();
	   //Selecting date 23 October 2025
	   String year=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
	   int yearValue=Integer.parseInt(year);
	   int expectedYear=2025;
	   //Selecting expected year value
	   while(yearValue<expectedYear)
	   {
		   driver.findElement(By.xpath("//a[@title='Next']")).click();
		   year=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
		   yearValue=Integer.parseInt(year);
	   }
	   while(yearValue>expectedYear)
	   {
		   driver.findElement(By.xpath("//a[@title='Prev']")).click();
		   year=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
		   yearValue=Integer.parseInt(year);
	   }
	   
	   //Selectend expected month
	   String expectedMonthVal="October";
	   Month expectedMonth=convertMonth(expectedMonthVal);
	   while(true)
	   {
		   String month=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
		   Month currantMonth=convertMonth(month);
		   int result= expectedMonth.compareTo(currantMonth); 
		   //if result is greater than 0 then it is future month
		   //if result is less than 0 then it is past month
		   //if result is equal to 0 the both months are equal
		   if(result<0)
		   {
			   //past month
			   driver.findElement(By.xpath("//a[@title='Prev']")).click();
		   }
		   else if(result>0)
		   {
			   //future future
			   driver.findElement(By.xpath("//a[@title='Next']")).click();
		   }
		   else
		   {
			   //expected month
			   break;
		   }
	   }
	   
	   //Selecting expected date
	   String expected_date="23";
	   List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	   for(int i=0;i<dates.size();i++)
	   {
		   if(dates.get(i).getText().equalsIgnoreCase(expected_date))
		   {
			   dates.get(i).click();
			   break;
		   }
	   }
	   
	 
	  
	   
	    
	}

}
