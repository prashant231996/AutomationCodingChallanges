package com.automation.codingchallange;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadAndValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://storage.googleapis.com/chrome-for-testing-public/131.0.6778.87/win64/chromedriver-win64.zip");
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(50))
			    .pollingEvery(Duration.ofSeconds(5))
			    .ignoring(NoSuchElementException.class);
	//Need to add custom wait using fluent which will wait until file downloaded successfully
		Thread.sleep(30000);
		String fileName="chromedriver-win64.zip";
		File downloadedFile=new File(System.getProperty("user.home")+"/Downloads/"+fileName);
		try
		{
		if(downloadedFile.exists())
		{
			System.out.println("File is exist in mentioned folder");
		}
		else
		{
			System.out.println("File is not exist in mentioned folder.");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(downloadedFile.exists())
			{
				if(downloadedFile.delete())
				{
					System.out.println("File deleted successfully.");
				}
			}
		}
		
	}

}
