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

public class WebTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		//JavascriptExecuror Object
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement webTableHeader=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Web Table Example']")));
		js.executeScript("arguments[0].scrollIntoView();", webTableHeader);
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("Number of rows present in table is "+rows.size());
		int expectedrow=0;
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<columns.size();j++)
			{
				if(columns.get(j).getText().contains("Learn SQL"))
				{
					expectedrow=i;
					break;
				}
			}
		}
		List<WebElement>desiredColumnDetail=rows.get(expectedrow).findElements(By.tagName("td"));
		for(WebElement dataCell:desiredColumnDetail)
		{
			System.out.println(dataCell.getText());
		}
		driver.quit();	
	}
}
