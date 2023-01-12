package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New 
{
	public WebDriver driver;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Extentreport.html");
	  @BeforeTest
	  public void browserlaunch() 
	  {
		  extent.attachReporter(spark);
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://demo.actitime.com");
	  }
	
	  @AfterTest
	  public void teardown() 
	  {	
		  extent.flush();
		  driver.quit();
	  }
		  @Test
		  public void testcase_001()
		  {
				ExtentTest test = extent.createTest("verify the pageTitle").assignAuthor("abinash");
			  	String title = driver.getTitle();
			  	String expect = "actiTIME - Login";
			  	if(title.equals(expect))
			  	{
			  		test.pass("Page title is verified");
			  	}
			  	else
			  	{
			  		test.fail("testcase is failed");
			  	}
         }
} 
