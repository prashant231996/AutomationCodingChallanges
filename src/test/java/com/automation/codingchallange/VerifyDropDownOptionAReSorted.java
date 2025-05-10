package com.automation.codingchallange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyDropDownOptionAReSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement animalsDropDown=driver.findElement(By.id("animals"));
		js.executeScript("arguments[0].scrollIntoView(true);", animalsDropDown);
		Select animalDropDownSelEle=new Select(animalsDropDown);
		List<WebElement>options=animalDropDownSelEle.getOptions();
		List<String>originalList=new ArrayList<String>();
		List<String>tempList=new ArrayList<String>();
		for(WebElement option:options)
		{
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		//Soring the temp list using Collections.sort() method
		Collections.sort(tempList);
		
		if(originalList.equals(tempList))
		{
			System.out.println("Dropdown options are in sorted order");
		}
		else
		{
			System.out.println("Drop down options are not in sorted order");
		}
		driver.close();

	}

}
