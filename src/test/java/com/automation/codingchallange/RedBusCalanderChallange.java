package com.automation.codingchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusCalanderChallange {
	
	public WebDriver driver;
	
	@Test
	public void testRedBusCalender()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		List<String> weekendDates=getWeekEndDates("Mar 2024");
//		System.out.println(weekendDates);
		
		getWeekEndDates("Mar 2024");	
		
	}
	
	public List<String> getWeekEndDates(String Date) {
		// TODO Auto-generated method stub
	    String[]dateArr=Date.split(" ");
	    String month=dateArr[0];
	    String year=dateArr[1];
	    System.out.println("Month Value is "+month);
	    System.out.println("Year Value is "+year);
	    //Clicking on the Calendar Icon Present over Red Bus Website
	    WebElement calenderIcon=driver.findElement(By.xpath("//i[contains(@class,\"icon-date\")]"));
	    calenderIcon.click();
	    
	    
		return null;
	}

	@AfterTest
	public void closeTheWindow()
	{
		driver.close();
	}

}
