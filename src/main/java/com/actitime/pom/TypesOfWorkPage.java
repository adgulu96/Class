package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWorkPage 
{	
	public WebDriver driver;
	@FindBy (xpath="//span[.='Create Type of Work']")
	private WebElement createtypeworkbutton;
	
	@FindBy (xpath="//td[@class='aligned_radio_button_text']")
	private WebElement allradiobuttons;
	
	@FindBy (xpath="//input[@type='button']")
	private WebElement showtypesofwork;
	
	@FindBy (xpath="//a[.='machinary']")
	private WebElement worknamelink;
	
	@FindBy (xpath="//a[.='goods and machinaries']/../..//a[contains(text(),'delete')]")
	private WebElement deletebutton;
	
	public TypesOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createtypeOfWork()
	{
		createtypeworkbutton.click();
	}
	public void workNameLink()
	{
		worknamelink.click();
	}
	public void deleteWork() throws InterruptedException
	{
		Thread.sleep(1000);
		worknamelink.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
}
