package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.CustomerPage;
import com.actitime.pom.CustomerandProjectPage;

public class DeleteCreatedCustomer extends BaseTest
{
	@Test (priority = 1)
	public void deleteCreateCustomer() throws IOException, InterruptedException
	{
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.clickonTaskLink();
		
		CustomerandProjectPage custprjpage = new CustomerandProjectPage(driver);
		custprjpage.clickoneditbutton();
		
		CustomerPage custpage = new CustomerPage(driver);
		custpage.clickoneditbutton();
		custpage.clickonSettingsicon();
		Thread.sleep(2000);
		custpage.clickonActionbutton();
		custpage.clickonDeletecustbutton();
		custpage.deleteconfirmation();
		
		Thread.sleep(1500);
		home.clickonLogoutLink();
	}
}
