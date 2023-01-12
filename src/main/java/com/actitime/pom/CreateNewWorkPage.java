package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewWorkPage 
{
	@FindBy (name="name")
	private WebElement nametextfield;
	
	@FindBy (name="active")
	private WebElement statusdropdown;
	
	@FindBy (xpath="//td[@class='aligned_radio_button_cell']")
	private WebElement catagoryradiobutton;
	
	@FindBy (id="billingRate_input")
	private WebElement billingratetextfield;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement createtypeofworkbutton;
	
	@FindBy (xpath="(//input[@type='button'])[1]")
	private WebElement cancelbutton;
	
	public CreateNewWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createTypeOfWork() throws InterruptedException
	{
		Thread.sleep(1000);
		nametextfield.sendKeys("machinary");
		createtypeofworkbutton.click();
	}
	
	
	
	
	
	
	
	
}
