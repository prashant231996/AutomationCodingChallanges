package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.fasterxml.jackson.core.io.NumberInput;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPastInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		//Adding implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Maximizing the browser window
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
        //Approch 1 using sendkeys
		WebElement nameInputBox=driver.findElement(By.id("name"));
		nameInputBox.sendKeys("PRASHANT");
		WebElement emailInputBox=driver.findElement(By.id("email"));
		//Copy value control+a & control+c action
		nameInputBox.sendKeys(Keys.CONTROL, "a");
		nameInputBox.sendKeys(Keys.CONTROL,"c");
		//Past copied value  control+v action
		emailInputBox.sendKeys(Keys.CONTROL,"v");
		
		//Fetching the value what we have copy pasted
		String email=emailInputBox.getAttribute("value");
		
		Assert.assertEquals("PRASHANT", email);
		
			

	}

}
