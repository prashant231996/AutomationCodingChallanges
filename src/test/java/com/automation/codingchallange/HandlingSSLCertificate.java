package com.automation.codingchallange;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLCertificate {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		Assert.assertTrue(driver.findElement(By.cssSelector("#content")).isDisplayed());
		driver.quit();
	}

}
