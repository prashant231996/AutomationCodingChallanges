package com.automation.codingchallange;

import java.io.File;
import java.time.Duration;
import java.util.function.Function;

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
		String fileName="chromedriver-win64.zip";
		File downloadedFile=new File(System.getProperty("user.home")+"/Downloads/"+fileName);
		//Fluent Wait Declaration
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(50))
			    .pollingEvery(Duration.ofSeconds(5))
			    .ignoring(NoSuchElementException.class);
		//Method to check wheather file is downloaded successfully
		boolean fileExist=wait.until((WebDriver)->{
			return downloadedFile.exists();
			});
		try
		{
		if(fileExist)
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
			if(fileExist)
			{
				if(downloadedFile.delete())
				{
					System.out.println("File deleted successfully.");
				}
			}
		}
		
		driver.quit();
		
	}

}
