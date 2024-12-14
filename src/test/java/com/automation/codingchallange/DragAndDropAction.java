package com.automation.codingchallange;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement dragDropTitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Drag and Drop']")));
		js.executeScript("arguments[0].scrollIntoView()", dragDropTitle);
		//Creating Actions class object to perform drag and drop action
		Actions act=new Actions(driver);
		WebElement draggableElement=driver.findElement(By.id("draggable"));
		WebElement droppableElement=driver.findElement(By.id("droppable"));
		act.dragAndDrop(draggableElement, droppableElement).build().perform();
		//Asserting whether object dropeed correctly
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]")).isDisplayed());
		
		driver.close();
	}

}
