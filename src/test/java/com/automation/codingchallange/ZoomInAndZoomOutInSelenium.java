package com.automation.codingchallange;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomInAndZoomOutInSelenium {
	
	public static void main(String args[]) throws AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("Zoomming IN---");
		//Action Zooming In and Out using ROBOT class
		Robot robot=new Robot();
		//Zomming IN
		System.out.println("ZOOMING IN ACTION PERFORMING");
		//Need to do key press action 3 times so iterating loop for 3 time
		for(int i=1;i<=3;i++)
		{
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		System.out.println("ZOOMING OUT ACTION PERFORMING");
		//Need to do key press action 3 times so iterating loop for 3 time
		for(int i=1;i<=3;i++)
		{
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		driver.close();
		
	}

}
