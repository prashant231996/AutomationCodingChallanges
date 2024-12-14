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

public class HandlingDynamicPaginationWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://testautomationpractice.blogspot.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebDriverWait wait=new WebDriverWait(driver, 10);
       JavascriptExecutor js=(JavascriptExecutor)driver;
       WebElement tableTitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Pagination Web Table']")));
       js.executeScript("arguments[0].scrollIntoView()", tableTitle);
       List<WebElement>pages=driver.findElements(By.xpath("//*[@id='pagination']/li"));
       for(int i=0;i<pages.size();i++)
       {
    	   pages.get(i).click();
    	   List<WebElement>rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr"));
    	   for(int j=0;j<rows.size();j++)
    	   {
    		   List<WebElement>columns=rows.get(j).findElements(By.tagName("td"));
    		   for(int k=0;k<columns.size();k++)
    		   {
    			   if(k==columns.size()-1)
    			   {
    				   //Clicking on the checkbox
    				   columns.get(k).findElement(By.tagName("input")).click();
    			   }
    			   else
    			   {
    				   //Printing the text values of webelements
    			   System.out.println(columns.get(k).getText());
    			   }
    		   }
    	   }
    	   
       }
       
       driver.close();
       
	}

}
