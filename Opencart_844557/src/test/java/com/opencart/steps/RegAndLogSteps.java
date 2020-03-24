package com.opencart.steps;

import com.excel.util.excel_data;
import com.opencart.pages.RegAndLoginPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegAndLogSteps
{
	RegAndLoginPages reglog=new RegAndLoginPages();
	excel_data excel=new excel_data();
	
	@Given("^the user launch the browser for valid register$")
			public void the_user_launch_the_browser_for_valid_register() throws Throwable 
			{
				reglog.url("chrome");
			 
			}

	@When("^the  user opens opencart register page$")
			public void the_user_opens_opencart_register_page() throws Throwable 
			{
				reglog.opencart_register();
			    
			}

	@Then("^the user enters the valid register details$")
			public void the_user_enters_the_valid_register_details() throws Throwable 
			{
				reglog.register_details();
			   
			}
	@When("^the  user opens opencart login page$")
			public void the_user_opens_opencart_login_page() throws Throwable 
			{
				reglog.opencart_login();
			   
			}

	@Then("^the user enters the valid login details$")
			public void the_user_enters_the_valid_login_details() throws Throwable 
			{
				reglog.login_details(excel.excel_emailid(1),excel.excel_password(1));
				int count=excel.row_count();
				for(int i=2;i<=count;i++)
				{
					login.login_details(excel.excel_emailid(i),excel.excel_password(i));
				}
			    
			}
			
	@Then("^the user close the login page$")
			public void the_user_close_the_login_page() throws Throwable 
			{
				reglog.quit();
			   
			}
}
