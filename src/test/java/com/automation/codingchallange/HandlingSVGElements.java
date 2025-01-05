package com.automation.codingchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSVGElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //Implicite Wiat
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver, 10);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement svgElementHeader=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='SVG Elements']")));
        js.executeScript("arguments[0].scrollIntoView()", svgElementHeader);
        //Handling SVG Elements
        //SVG elments having svg tag in them
        //We can locate the svg element using name() method
        List<WebElement> svgElements=driver.findElements(By.xpath("//div[@class='svg-container']//*[name()='svg']"));
        System.out.println("SVG element list size: "+svgElements.size());
        //Getting color values from svg element
        for(WebElement svgElement:svgElements )
        {
        	//System.out.println(svgElement.getAttribute("width"));
        	System.out.println(svgElement.findElement(By.xpath("//*[@stroke='black']")).getAttribute("fill"));
        }
        
	}

}
