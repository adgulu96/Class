package com.actitime.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerandProjectPage 
{
	public WebDriver driver;
	@FindBy (xpath="(//div[.='Customers & Projects'])[1]/../../..//div[.='John Martin']")
	private WebElement customernameeditbutton;
	
	public CustomerandProjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickoneditbutton()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click()", customernameeditbutton);
		
	}
}
