package com.actitime.test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLoginLogoutExtentReport extends BaseTest
{
	@Test
	public void actitimeloginlogoutEXRepo() throws IOException
	{
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\ExtentsReports\\Report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		
		WebDriverManager.chromedriver().setup();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		extent.flush(); //flush output to the HTML file
		
		Desktop.getDesktop().browse(file.toURI()); //to open the file automatically
		
	}
}
