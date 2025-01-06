package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebDriverWait wait=new WebDriverWait(driver,10);
		Actions act=new Actions(driver);
		WebElement silderHeader=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Slider']")));
		js.executeScript("arguments[0].scrollIntoView()", silderHeader);
		
		WebElement minSlider=driver.findElement(By.xpath("(//div[@id='slider-range']/span)[1]"));
		System.out.println("Default location of minimum slider is "+minSlider.getLocation());
		
		WebElement maxSlider=driver.findElement(By.xpath("(//div[@id='slider-range']/span)[2]"));
		System.out.println("Default location of maximun slider is "+maxSlider.getLocation());
		
		//Handling Minimum slider
		act.dragAndDropBy(minSlider, 100, 1968);
		System.out.println("Default location of minimum slider after sliding is "+minSlider.getLocation());
		
		//Handling Maximum slider
		act.dragAndDropBy(maxSlider, -50, 1968);
		System.out.println("Default location of maximun slider after sliding is "+maxSlider.getLocation());
		
	}

}
