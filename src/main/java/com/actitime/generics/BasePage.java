package com.actitime.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	public void selectbyvisibletext(WebElement element , String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectbyvalue(WebElement element , String text)
	{
		Select select=new Select(element);
		select.selectByValue(text);
	}
	
	public void selectbyIndex(WebElement element , int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void deselectbyvalue(WebElement element )
	{
		Select select=new Select(element);
		select.deselectAll();
	}
	
	public void deselectbyvisibletext(WebElement element , String text)
	{
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}
	
	public void deselectbyIndex(WebElement element , int index)
	{
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	
	public void isMultiple(WebElement element)
	{
		Select select=new Select(element);
		select.isMultiple();
	}
	
	public void getOptions(WebElement element,String options)
	{
		Select select=new Select(element);
		List<WebElement> list =select.getOptions();
		for (int i=0;i<=list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(options))
			{
				String text = list.get(i).getText();
				System.out.println(text);
			}
		}
	}
	
	public void getAllSelectedOptions(WebElement element,String options)
	{
		Select select=new Select(element);
		select.getAllSelectedOptions();
		System.out.println(select.getAllSelectedOptions());
	}
	
	public void getFirstSelectedOption(WebElement element)
	{
		Select select=new Select(element);
		WebElement firstoption= select.getFirstSelectedOption();
		System.out.println(firstoption);
	}
	
	public void mouseClickOperation(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.click(element).perform();
	}
	
	public void mouseDoubleClickOperation(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	public void mouseContextClickOperation(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
	}
	
	public void mousemovetoelement(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void mousedragAndDrop(WebDriver driver , WebElement source,WebElement target)
	{
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	
	public void mouseclickAndHold(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.clickAndHold(element).perform();
	}
	
	public void mouseReleaseOperation(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void robotenter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void alertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	public void javascriptclick(WebDriver driver , WebElement element) 
	  {
	  	JavascriptExecutor js=(JavascriptExecutor)driver;
	  	js.executeScript("arguments[0].click()", element); 
	  }
	
	public void javascriptclick(WebDriver driver , By element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void explicitwaittitleis(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public void explicitwaittitleContains(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void explicitwaitUrlContains(WebDriver driver , String url)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlContains(url));
	}
	public void explicitwaitVisibilityof(WebDriver driver , WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void explicitwaitvisibilityofelementlocatedbylocator(WebDriver driver , By element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public void hardAssertvalidatetitle(WebDriver driver , String expectedtitle)
	{
		String actualTitle=driver.getTitle();
		String expectedTitle=expectedtitle;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void assertNotEquals(WebDriver driver , String expectedtitle)
	{
		String actualTitle=driver.getTitle();
		String expectedTitle=expectedtitle;
		Assert.assertNotEquals(actualTitle, expectedTitle);
	}
	
	public void validatetext(WebElement element , String expectedtext)
	{
		String actualText=element.getText();
		String expectedText=expectedtext;
		Assert.assertEquals(actualText, expectedText);
	}
	
}
