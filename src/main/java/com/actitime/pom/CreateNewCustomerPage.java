package com.actitime.pom;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BaseTest;
import com.actitime.generics.ExcelLibrary;

public class CreateNewCustomerPage  extends BaseTest implements AutoConstant
{
	public WebDriver driver;
	@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customernametextfield;
	
	@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptiontextarea;
	
	@FindBy (xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement selectcustdropdown;
	
	@FindBy (xpath="//div[.='Create Customer']")
	private WebElement createcustomerbutton;
	
	@FindBy (xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cacelbutton;
	
	public CreateNewCustomerPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewCustomer(String data) throws IOException
	{
		customernametextfield.sendKeys(ExcelLibrary.getcellvalue(data, 1, 0));
		descriptiontextarea.sendKeys(ExcelLibrary.getcellvalue(data, 1, 1));
		createcustomerbutton.click();
	}
	public void selectCustomerDropDown()
	{
		selectcustdropdown.click();
	}
	public void cancelButton()
	{
		cacelbutton.click();
	}
}
