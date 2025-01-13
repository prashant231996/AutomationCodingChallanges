package com.automation.codingchallange;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CTRLPlusClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement laptopLink=driver.findElement(By.xpath("//*[text()='Laptop Links']"));
		js.executeScript("arguments[0].scrollIntoView()", laptopLink);
		WebElement appleLaptopLink=driver.findElement(By.cssSelector("#apple"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(appleLaptopLink).keyUp(Keys.CONTROL).build().perform();
		String parentWindow=driver.getWindowHandle();
		Set<String>windowHandles=driver.getWindowHandles();
		for(String windowHandle:windowHandles)
		{
			if(!windowHandle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(windowHandle);
			}
		}
		Assert.assertEquals(driver.getTitle(), "Apple");
	}

}
