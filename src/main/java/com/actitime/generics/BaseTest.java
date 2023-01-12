package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void executionstart()
	{
		System.out.println("execution started");
	}
	
	@Parameters("browser")
	
	@BeforeClass
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}
	
	@BeforeMethod
	public void enterURL()
	{
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executioncomplete()
	{
		System.out.println("execution completed");
	}
}
