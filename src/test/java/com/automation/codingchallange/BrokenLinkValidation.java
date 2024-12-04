package com.automation.codingchallange;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkValidation {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			if(validateBrokenLink(url))
			{
				System.out.println(url+"It is not a broken link");
			}
			else
			{
				System.out.println(url+"It is a broken link");
			}
			
		}
		driver.quit();
	}
	
	public static boolean validateBrokenLink(String link)
	{
		try
		{
			URL url=new URL(link);
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.connect();
			if(conn.getResponseCode()==200 && conn.getResponseMessage().equalsIgnoreCase("OK"))
			{
//			if(conn.getResponseCode()==200)
//			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
