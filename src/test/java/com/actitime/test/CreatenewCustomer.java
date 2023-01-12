package com.actitime.test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.AutoConstant;
import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.CreateNewCustomerPage;
import com.actitime.pom.TaskLinkPage;

public class CreatenewCustomer extends BaseTest implements AutoConstant
{
	@Test (priority = 2)
	public void createnewCustomer() throws IOException, InterruptedException
	{
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.clickonTaskLink();
		
		TaskLinkPage task = new TaskLinkPage(driver);
		task.addnewButton();
		task.addnewCustomerLink();
		Thread.sleep(1000);
		
		CreateNewCustomerPage cust = new CreateNewCustomerPage(driver);
		cust.createNewCustomer("CustomerData");
		
		home.logoutMethod();
	}
}
	
	

