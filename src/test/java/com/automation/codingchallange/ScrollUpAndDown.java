package com.automation.codingchallange;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//SCROLL UP ACTION
		WebElement footerElement=driver.findElement(By.xpath("//*[text()='Broken Links']"));
		js.executeScript("arguments[0].scrollIntoView(true)", footerElement);
		Thread.sleep(4000);
		//SCROLL DOWN ACTION
		WebElement headerElement=driver.findElement(By.xpath("//*[text()='Tabs']"));
		js.executeScript("arguments[0].scrollIntoView(false)", headerElement);
	}

}
