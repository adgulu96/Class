package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeaveTypePage 
{
	public WebDriver driver;
	@FindBy (id="leaveTypeLightBox_nameField")
	private WebElement nametextfield;
	
	@FindBy (xpath="//a[@class='x-menu-item']")
	private WebElement statusddoptions;
	
	@FindBy (id="leaveTypeLightBox_rateCoefficient")
	private WebElement leavehourratetextfield;
	
	@FindBy (xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement createleavebutton;
	
	@FindBy (xpath="(//div[.='Cancel'])[2]")
	private WebElement cancelbutton;
	
	public CreateNewLeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createaLeaveType()
	{
		nametextfield.sendKeys("movie");
		createleavebutton.click();
		
	}

}
