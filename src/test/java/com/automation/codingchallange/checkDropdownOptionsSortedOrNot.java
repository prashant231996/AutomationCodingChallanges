package com.automation.codingchallange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkDropdownOptionsSortedOrNot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropDown=driver.findElement(By.id("animals"));
		Select select=new Select(dropDown);
		List<WebElement>originalList=select.getOptions();
		List<String>animalNames=new ArrayList<String>();
		for(WebElement option:originalList)
		{
			animalNames.add(option.getText());
		}
		List<String>sortedanimalNames=new ArrayList<String>(animalNames);
		Collections.sort(sortedanimalNames);
		if(animalNames.equals(sortedanimalNames))
		{
			System.out.println("Doropdown options are sorted in nature");
		}
		else
		{
			System.out.println("Dropdown options are not in sorted order");
		}
		driver.quit();
	}

}
