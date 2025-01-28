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

public class HandlingSuggestionDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		//JavascriptExecutor object
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement suggestionDropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
		suggestionDropdown.sendKeys("india");
		List<WebElement>suggestedOptions=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".ui-menu-item div")));
		for(WebElement option:suggestedOptions)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		driver.close();

	}

}
