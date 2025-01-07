package com.automation.codingchallange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingExcelData {

	@Test(dataProvider = "loginData")
	public void loginTest(String userName,String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://askomdch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Account']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys(userName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(userName);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
	}
	
	@DataProvider(name="loginData")
	public Object[][]getLoginData() throws IOException
	{
		String excelFlePath=System.getProperty("user.dir")+"/src/test/resources/Data.xlsx";
		File excelFile=new File(excelFlePath);
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("loginData");
		int rowNum=sheet.getLastRowNum();
		System.out.println("Row number is "+rowNum);
		int colNum=sheet.getRow(0).getLastCellNum();
		System.out.println("Column number is "+colNum);
		Object data[][]=new Object[rowNum][colNum];
		//row index strted from zero, So in for condition is i<=rownum
		for(int i=1;i<=rowNum;i++)
		{
			for(int j=0;j<colNum;j++)
			{
				data[i-1][j]=getCellData(sheet,i,j);
				System.out.println(data[i-1][j]);
			}
		}
		return data;
	}
	
	public static String getCellData(XSSFSheet sheet,int rowNum,int colNum)
	{
		XSSFRow row=sheet.getRow(rowNum);
		XSSFCell cell=row.getCell(colNum);
		//DataFormatter will return formatted cell value as string with respect to any cell type of that cell.
		DataFormatter formatter=new DataFormatter();
		return formatter.formatCellValue(cell);
	}

}
