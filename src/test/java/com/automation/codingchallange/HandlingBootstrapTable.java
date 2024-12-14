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

public class HandlingBootstrapTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebDriverWait wait=new WebDriverWait(driver, 10);
	       JavascriptExecutor js=(JavascriptExecutor)driver;  	
		   driver.findElement(By.name("username")).sendKeys("Admin");
		   driver.findElement(By.name("password")).sendKeys("admin123");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[text()='Admin']"))).click();
	       WebElement table=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@role,'table')]")));
	       js.executeScript("arguments[0].scrollIntoView()",table);
	       List<WebElement>rows=driver.findElements(By.xpath("//div[contains(@role,'table')]//div[@class='oxd-table-body']/div/div[@role='row']"));
	       for(int i=0;i<rows.size();i++)
	       {
	    	   List<WebElement>columns=rows.get(i).findElements(By.xpath("//div[@role='cell']"));
	    	   for(int j=0;j<columns.size();j++)
	    	   {
	    			   System.out.print(columns.get(j).findElement(By.tagName("div")).getText()+"\t");
	    	   }
	    	   System.out.println();
	       }
	       
	}

}
