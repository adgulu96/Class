package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage 
{
	//Declaration
	@FindBy (xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsdropdown;
	
	@FindBy (xpath="//a[.='Types of Work']")
	private WebElement typeofworklink;
	
	@FindBy (xpath="//a[.='Leave Types']")
	private WebElement leavestype;

	//Initialization
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Non-static methods
	public void clickOnSettingdropdown()
	{
		settingsdropdown.click();
	}
	public void clickOnTypesOfWork()
	{
		typeofworklink.click();
	}
	public void clickonLeaveType()
	{
		leavestype.click();
	}
}
