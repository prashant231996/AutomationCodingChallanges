package com.automation.codingchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountNumberOfWebelementsOnScrollingWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		int previousCount=0;
		int currantCount=0;
		
		while(true)
		{
			List<WebElement>elementList=driver.findElements(By.cssSelector(".category_page h3"));
			currantCount=elementList.size();
			if(previousCount==currantCount)
			{
				break;
			}
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			previousCount=currantCount;
			Thread.sleep(5000);
		}
		
		System.out.println("Elements over scrolling webpage are "+currantCount);
		
	}

}
