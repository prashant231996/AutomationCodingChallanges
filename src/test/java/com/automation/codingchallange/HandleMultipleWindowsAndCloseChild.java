package com.automation.codingchallange;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindowsAndCloseChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://the-internet.herokuapp.com/windows");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Opening a new window']")));
		String parentWindow=driver.getWindowHandle();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Click Here"))).click();
		Set<String>windowHandles=driver.getWindowHandles();
		for(String windowHandle:windowHandles)
		{
			if(!windowHandle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(windowHandle);
			}
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='New Window']")));
		Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed());
		//Closing child window
		driver.close();
		System.out.println("Closing child window successfully..");
		//Switching back to parent window
		driver.switchTo().window(parentWindow);
		Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).isDisplayed());
		driver.close();
		System.out.println("Closing Parent window successfully..");
	}

}
