package com.automation.codingchallange.threadsafty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadSafty {
		// TODO Auto-generated method stub
		private static ThreadLocal<WebDriver>tDriver=new ThreadLocal<WebDriver>();
		WebDriver driver;
		
		public void setDriver(WebDriver driver)
		{
			tDriver.set(driver);
		}
		
		public WebDriver getDriver()
		{
			return tDriver.get();
		}
		
		@Test
		public void chromeAction1()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			setDriver(driver);
			getDriver().get("https://www.google.com/");
			System.out.println("Title is "+driver.getTitle());
		}
		
		@Test
		public void chromeActio2()
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			setDriver(driver);
			getDriver().get("https://www.amazon.in/");
			System.out.println("Title is "+driver.getTitle());
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.close();
		}
		
		

}
