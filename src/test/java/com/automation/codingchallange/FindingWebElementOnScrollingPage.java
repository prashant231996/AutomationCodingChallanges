package com.automation.codingchallange;

import java.time.Duration;
import java.util.List;
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

public class FindingWebElementOnScrollingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		//WebElement resultanatElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='category_page']/*[contains(text(),'Mountain Rescue (Oxford Reading Tree)')]")));
		//WebElement resultElement=driver.findElement(By.xpath("//*[@class='category_page']/*[contains(text(),'Mountain Rescue (Oxford Reading Tree)')]"));
//		Actions act=new Actions(driver);
//		act.scrollToElement(resultanatElement);
		String expectedbookTitle="Mountain Rescue (Oxford Reading Tree)";
		//LOGIC==>
		boolean found=false;
		while(!found)
		{
			List<WebElement>books=driver.findElements(By.cssSelector(".category_page h3"));
			for(WebElement book:books)
			{
				if(book.getText().equalsIgnoreCase(expectedbookTitle))
				{
					found=true;
					System.out.println("Books is found...");
					break;
				}
			}
			//If book is not found we are scrolling down the page.
			//Scrolling down the page to the page height
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		
		

	}

}
