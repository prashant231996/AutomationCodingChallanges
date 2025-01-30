package com.automation.codingchallange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoScripRunning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Assert.assertEquals(driver.getTitle(), "Practice Page");
		driver.quit();
	}

}
