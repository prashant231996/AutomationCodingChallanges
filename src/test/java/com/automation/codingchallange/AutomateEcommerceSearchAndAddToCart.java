package com.automation.codingchallange;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateEcommerceSearchAndAddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String laptopBrand="HP";
		String laptopname="HP Laptop Intel Core i3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		//Maximize browser window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://www.flipkart.com");
		//Searching laptop in search box
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("laptop");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys(Keys.ENTER);
	    //Selecting respective brand
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Brand']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']/following-sibling::*[text()='"+laptopBrand+"']/preceding-sibling::div"))).click();
        driver.navigate().refresh();		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'"+laptopname+"')])"))).click();
		//After clicking on desired laptop opening it in new tab to add it into the cart
		String parentWindow=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		for(String window:windows)
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
			}
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'HP Laptop Intel Core i3')])[3]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']"))).click();
		//Verifying respective item in cart
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Cart']"))).click();
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'"+laptopname+"')]"))).isDisplayed());
		//closing driver instance
		driver.quit();
	}

}
