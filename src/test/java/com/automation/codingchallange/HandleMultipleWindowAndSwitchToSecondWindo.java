package com.automation.codingchallange;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindowAndSwitchToSecondWindo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		//JavascriptExecutor object
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement windowspoppup=driver.findElement(By.id("PopUp"));
		js.executeScript("arguments[0].scrollIntoView()", windowspoppup);
		windowspoppup.click();
		windowspoppup.click();
		String parentWindowId=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		System.out.println("Number of launched windows are: "+windows.size());
		//Want to swith second window so converting set to list & by index switching to respective window
		List<String>windowList=new ArrayList<String>(windows);
		driver.switchTo().window(windowList.get(0));
		System.out.println("Page Title of first window is "+driver.getTitle());
		driver.switchTo().window(windowList.get(1));
		System.out.println("Page Title of second window is "+driver.getTitle());
		driver.switchTo().window(windowList.get(2));
		System.out.println("Page Title of third window is "+driver.getTitle());
		//Closing all the browser windows which are opened by automation scripts
		driver.quit();
	}

}
