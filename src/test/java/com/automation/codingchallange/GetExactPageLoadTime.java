package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetExactPageLoadTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		StopWatch pageLoad = new StopWatch();
	    pageLoad.start();
	    //Open your web app (In my case, I opened facebook)
	    driver.get("https://www.facebook.com/");
	    // Wait for the required any element (I am waiting for Login button in fb)
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
	    pageLoad.stop();
	    //Get the time
	    long pageLoadTime_ms = pageLoad.getTime();
	    long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
	    System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
	    System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
	    System.out.println("Total Page Load Time in minutes: "+pageLoad.getTime(TimeUnit.MINUTES));
	    driver.close();

	}
}
