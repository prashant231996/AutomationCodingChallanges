package com.automation.codingchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandlingDynamicWebTable {
	
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
		WebElement tableHeader=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Dynamic Web Table']")));
		js.executeScript("arguments[0].scrollIntoView();", tableHeader);
		List<WebElement>headers=driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
		String headerValue="CPU";
		int expectedColumn=0;
		String CPULoad="";
		for(int i=0;i<headers.size();i++)
		{
			if(headers.get(i).getText().contains(headerValue))
			{
			     expectedColumn=i;
			     break;
			}
		}
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		String browserName="Chrome";
		for(int i=0;i<rows.size();i++)
		{
			if(rows.get(i).findElement(By.tagName("td")).getText().equalsIgnoreCase(browserName))
			{
				List<WebElement>dataCells=rows.get(i).findElements(By.tagName("td"));
				CPULoad=dataCells.get(expectedColumn).getText();
				break;
			}
		}
		WebElement displayedCpuLoad=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'CPU load of Chrome process')]/strong ")));
		System.out.println("CPU LOAD in percentage is :"+CPULoad);
		Assert.assertEquals(CPULoad, displayedCpuLoad.getText());
		driver.quit();
	}

}
