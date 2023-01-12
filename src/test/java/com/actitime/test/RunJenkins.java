package com.actitime.test;

import org.testng.annotations.Test;


public class RunJenkins 
{
	@Test
	public void login()
	{
		System.out.println("Login to the application");
	}
	@Test
	public void homepage()
	{
		System.out.println("navigated to the homepage");
	}
	@Test
	public void campaigns()
	{
		System.out.println("Go to the campaign page");
	}
	@Test 
	public void createcampaign()
	{
		System.out.println("Create new campaign");
	}
}
