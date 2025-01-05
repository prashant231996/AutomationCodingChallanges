package com.automation.codingchallange;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingShadowDOMElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://testautomationpractice.blogspot.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //In latest release of selenium we can define implicitly wait as
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       WebDriverWait wait=new WebDriverWait(driver,10);
       WebElement shadowDomHeader=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='ShadowDOM']")));
       js.executeScript("arguments[0].scrollIntoView()", shadowDomHeader);
       //Handling shadow dom elements using shadow host/
       //Hierarchy of shadow dom element is
       //shadow Host==>shadow Root==>shadow element
       //SearchContext shadow1=driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
       //shadow1.findElement(By.cssSelector("input[type='text']")).sendKeys("Prashant");
       
       
	}

}
