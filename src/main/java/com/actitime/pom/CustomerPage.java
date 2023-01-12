package com.actitime.pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage 
{
	public WebDriver driver;
	@FindBy (xpath="(//div[.='Customers & Projects'])[1]/../../..//div[.='John Martin']")
	private WebElement editnametextfield;
	
	@FindBy (xpath="//div[@title='John Martin']/..//div[@class='editButton']")
	private WebElement settingsbutton;
	
	@FindBy (xpath="//span[@class='customerName']/../..//span[@class='tabText']")
	private List<WebElement> tabtextofcustomerpage;
	
	@FindBy (xpath="//span[@class='customerName']/../..//div[@class='actionButton']")
	private WebElement actionbutton;
	
	@FindBy (xpath="//span[@class='customerName']/../../../..//div[.='Delete']")
	private WebElement deletecustbutton;
	
	@FindBy (xpath="(//span[@class='customerName']/../../../..//div[.='Copy'])[2]")
	private WebElement copybutton;
	
	@FindBy (xpath="(//span[@class='placeholderText'])[1]")
	private WebElement writeacommenttextfield;
	
	@FindBy (xpath="//span[.='Delete permanently']")
	private WebElement deleteconfirm;
	
	public CustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickoneditbutton()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",editnametextfield );
	}
	public void clickonSettingsicon()
	{
		settingsbutton.click();
	}
	public void clickonActionbutton()
	{
		Actions act = new Actions(driver);
		act.click(actionbutton).perform();
		
	}
	public void clickonDeletecustbutton()
	{
		deletecustbutton.click();
		
	}
	public void deleteconfirmation()
	{
		deleteconfirm.click();
	}
}
