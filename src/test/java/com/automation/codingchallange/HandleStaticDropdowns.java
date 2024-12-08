package com.automation.codingchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleStaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement countryDropDownElement=driver.findElement(By.id("country-list"));
		Select contryDropDown=new Select(countryDropDownElement);
		List<WebElement>options=contryDropDown.getOptions();
		//Printing number of options
		System.out.println("Total number of options are "+options.size());
		//Printing all Options
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		//selecting one of the option
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
	}

}
