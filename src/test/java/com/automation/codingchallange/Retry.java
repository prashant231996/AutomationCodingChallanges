package com.automation.codingchallange;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	public static int maxCount=3;
	public static int count=0;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(result.getStatus()==ITestResult.FAILURE)
		{
		      if(count<maxCount)
		      {
			    count++;
			    return true;
		      }
		}
		return false;
	}

}
