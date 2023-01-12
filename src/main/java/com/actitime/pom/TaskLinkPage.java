package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskLinkPage 
{
	@FindBy (xpath="//div[.='Add New']")
	private WebElement addnewbutton;
	
	@FindBy (xpath="//div[@class='item createNewCustomer']")
	private WebElement addnewcustomer;
	
	@FindBy (xpath="//div[@class='item createNewProject']")
	private WebElement addnewproject;
	
	@FindBy (xpath="//div[@class='item importTasks']")
	private WebElement addnewtasks;
	
	@FindBy (xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchtextfield;
	
	@FindBy (xpath="//div[.='Export list to CSV']")
	private WebElement exportlisttocsv;
	
	@FindBy (xpath="//div[.='Configure columns']")
	private WebElement configureconlumns;
	
	public TaskLinkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addnewButton()
	{
		addnewbutton.click();
	}
	public void addnewCustomerLink()
	{
		addnewcustomer.click();
	}
	public void addnewProjectLink()
	{
		addnewproject.click();
	}
	public void addnewTaskLink()
	{
		addnewtasks.click();
	}
	public void addnewSearchLink()
	{
		addnewcustomer.click();
	}
	public void exportListtoCsv()
	{
		exportlisttocsv.click();
	}
	public void configureColums()
	{
		configureconlumns.click();
	}

	
}
