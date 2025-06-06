package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement inputTextBox=driver.findElement(By.id("inputText1"));
		action.sendKeys(inputTextBox,"prashant").build().perform();
		//CTR+A
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		//CTR+C
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		//TAB
		//action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		inputTextBox.sendKeys(Keys.TAB);
		//CTR+V
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
			
	}

}
