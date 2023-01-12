package com.actitime.pom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveTypePage 
{
	WebDriver driver;
	@FindBy (xpath="(//span[.='Create Leave Type'])[1]")
	private WebElement createleavetypelink;
	
	public LeaveTypePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createLeaveType()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", createleavetypelink);
	}
}
