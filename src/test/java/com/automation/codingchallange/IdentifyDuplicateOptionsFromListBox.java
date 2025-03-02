package com.automation.codingchallange;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifyDuplicateOptionsFromListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement colorDropdown=driver.findElement(By.id("colors"));
		Select dropDown=new Select(colorDropdown);
		List<WebElement>options=dropDown.getOptions();
		Set<String>dropDownOptions=new HashSet<String>();
		for(WebElement option:options)
		{
			if(dropDownOptions.add(option.getText()))
			{
				System.out.println("Duplicate option is "+option.getText());
			}
		}
		System.out.println("Unique options present at dropdown is ");
		for(String option:dropDownOptions)
		{
			System.out.print(option+" ");
		}
		driver.quit();
		
	}

}
