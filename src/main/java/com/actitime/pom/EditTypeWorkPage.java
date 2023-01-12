package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditTypeWorkPage 
{
	public WebDriver driver;
	@FindBy (xpath="//input[@value='Delete This Type of Work']")
	private WebElement deletethiswork;
	
	@FindBy (xpath="//a[.='goods and services']")
	private WebElement editedworkdelete;
	
	@FindBy (name="name")
	private WebElement editnametextfield;
	
	@FindBy (name="active")
	private WebElement statusdropdown;
	
	@FindBy (xpath="//input[@type='radio']")
	private WebElement catagoryradiobutton;
	
	@FindBy (id="billingRate_input")
	private WebElement billingratetextfield;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement savechangesbutton;
	
	@FindBy (xpath="//input[@onclick='handleCancel();']")
	private WebElement cancelbutton;
	
	
	public EditTypeWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void deleteThisWork() throws InterruptedException
	{
		editedworkdelete.click();
		deletethiswork.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	public void editWorkName()
	{
		editnametextfield.clear();
		editnametextfield.sendKeys("goods and machinaries");
	}
	public void statusDropDownbutton()
	{
		statusdropdown.click();
	}
	public void catagoryRadioButton()
	{
		Select sel = new Select(catagoryradiobutton);
		sel.selectByVisibleText("active");
	}
	public void billTextField()
	{
		billingratetextfield.sendKeys("13232");
	}
	public void saveChangesButton()
	{
		savechangesbutton.click();
	}
	public void cancelButton()
	{
		cancelbutton.click();
	}

	
}
