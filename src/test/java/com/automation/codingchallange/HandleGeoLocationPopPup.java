package com.automation.codingchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleGeoLocationPopPup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       //Creating ChromeOptions in which disabling geolocation
       ChromeOptions options=new ChromeOptions();
       options.addArguments("disable-geolocation");
       WebDriver driver=new ChromeDriver(options);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_geolocation");
       driver.switchTo().frame("iframeResult");
       driver.findElement(By.xpath("//button[@onclick='getLocation()']"));
       driver.quit();
	}

}
