package com.automation.codingchallange;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTabLaunchUrlAndGetPageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='New Tab']"))).click();
		String parentWindow=driver.getWindowHandle();
		Set<String>windowHandles=driver.getWindowHandles();
		for(String windowId:windowHandles)
		{
			if(!windowId.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(windowId);
			}
		}
		System.out.println("Title of child page is "+driver.getTitle());
		
		//Switching back to parent window
		driver.switchTo().window(parentWindow);
		System.out.println("Title of parent page is "+driver.getTitle());
        driver.close();
	}

}
