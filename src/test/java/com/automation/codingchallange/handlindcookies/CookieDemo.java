package com.automation.codingchallange.handlindcookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieDemo {
	
	//Cammads used to handle browser cookies in selenium
	/*
	 * get cookies in set =>driver.manage().getCookies();
	 * get single cookie==>driver.manage().getCookieNamed(name of the cookie);
	 * create and add cookie==>driver.manage().addCookie(cookie object);
	 * delete specific cookie==>driver.manage().deleteCookie(cookie object);
	 * delete specific cookie according name==>driver.manage().deleteCookieName(name of cookie);
	 * delete all cookies==> driver.manage().deleteAllCookies(); 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Capturing all the cookies from browser
		Set<Cookie>cookies=driver.manage().getCookies();
	    System.out.println("Count of cookies is "+cookies.size());
	    
	    //Read and print all the cookies name and value
//	    for(Cookie cookie:cookies)
//	    {
//	    	System.out.println("Cookie name is "+cookie.getName()+" value is "+cookie.getValue());
//	    }
	    
	    //Read the cookie by passing respective cokkie name
	    Cookie cookie=driver.manage().getCookieNamed("session-id");
	    System.out.println("Cookie name is "+cookie.getName()+" Value is "+cookie.getValue());
	    
	    //Adding new cookie to the browser
	    Cookie cookieObj=new Cookie("mycookie","12345PrashantMore");
	    driver.manage().addCookie(cookieObj);
	    Set<Cookie>cookiesSet=driver.manage().getCookies();
	    System.out.println("After adding new cookie , size is "+cookiesSet.size());
	    for(Cookie cookieVal:cookiesSet)
	    {
	    	System.out.println("Cookie name is "+cookieVal.getName()+" value is "+cookieVal.getValue());
	    }
	    
	    //Delete the cookie using cookie object
//	    driver.manage().deleteCookie(cookieObj);
//	    cookiesSet=driver.manage().getCookies();
//	    System.out.println("After deleting cookie , size is "+cookiesSet.size());
	    //Deleting the cookie using cookie name
	    driver.manage().deleteCookieNamed("mycookie");
	    cookiesSet=driver.manage().getCookies();
	    System.out.println("Size of cookies after deleting the specific cookie "+cookiesSet.size());
	    for(Cookie cookieVal:cookiesSet)
	    {
	    	System.out.println("Cookie name is "+cookieVal.getName()+" Value of cookie is "+cookieVal.getValue());
	    }
        //Deleting all the cookies
	    driver.manage().deleteAllCookies();
	    cookiesSet=driver.manage().getCookies();
	    System.out.println("Size of cookies after deleting all cookies "+cookiesSet.size());
	    
	    driver.quit();
	}

}
