package com.actitime.pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy  (id="username")
	private WebElement usernametextfield;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement passwordtextfield;
	
	@FindBy (id="loginButton")
	private WebElement loginbutton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}	

	public void loginMethod() throws IOException
	{
		usernametextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 3, 0));
		passwordtextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 3, 1));
		loginbutton.click();
	}

}