package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class ActitimeHomePage extends BasePage
{
	public WebDriver driver;
	
	@FindBy (xpath="(//div[@class='menu_icon'])[2]")
    private WebElement settinglink;
	
	@FindBy (id="logoutLink")
	private WebElement logoutlink;
	
	@FindBy(xpath="(//div[.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactiplans;
	
	@FindBy (id="container_tt")
	private WebElement timetracklink;
	
	@FindBy (id="container_tasks")
	private WebElement tasklink;
	
	@FindBy (id="container_reports")
	private WebElement reportslink;
	
	@FindBy (id="container_users")
	private WebElement userslink;
	
	@FindBy (xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendarsdropdown;
	
	@FindBy (xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsdropdown;
	
	@FindBy (xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsdropdown;
	
	@FindBy (xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportdropdown;
	
	@FindBy (xpath="//a[@class='userProfileLink username ']")
	private WebElement userprofilelink;
	
	@FindBy (xpath="//div[@class='supportQuestionButton']")
	private WebElement gotaquestiontooltip;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void settingsMethod()
	{
		explicitwaitvisibilityofelementlocatedbylocator(driver, By.xpath("(//div[@class='menu_icon'])[2]"));
		javascriptclick(driver, settinglink);
	}
	
	public void logoutMethod()
	{
		explicitwaitVisibilityof(driver, logoutlink);
		logoutlink.click();
	}
	
	public void switchToActiPlans()
	{
		switchtoactiplans.click();
	}
	public void timetrackLink() throws InterruptedException
	{
		timetracklink.click();
		Thread.sleep(3000);
	}
	public void clickonTaskLink() throws InterruptedException
	{
		explicitwaitvisibilityofelementlocatedbylocator(driver, By.id("container_tasks"));
		tasklink.click();
		Thread.sleep(3000);
	}
	public void clickonReportsLink() throws InterruptedException
	{
		reportslink.click();
		Thread.sleep(3000);
	}
	public void clickonUsersLink() throws InterruptedException
	{
		userslink.click();
		Thread.sleep(3000);
	}
	public void clickCalendarDropDown() throws InterruptedException
	{
		calendarsdropdown.click();
		Thread.sleep(3000);
	}

	public void clickonIntegrationsDropDown() throws InterruptedException
	{
		integrationsdropdown.click();
		Thread.sleep(3000);
	}
	public void clickonHelpandSupportDropDown() throws InterruptedException
	{
		helpandsupportdropdown.click();
		Thread.sleep(3000);
	}
	public void clickonUsersProfileLink() throws InterruptedException
	{
		userprofilelink.click();
		Thread.sleep(3000);
	}
	public void clickonLogoutLink() throws InterruptedException
	{
		logoutlink.click();
		Thread.sleep(3000);
	}
	public void clickonGotAquestionToolTip() throws InterruptedException
	{
		gotaquestiontooltip.click();
		Thread.sleep(3000);
	}
}