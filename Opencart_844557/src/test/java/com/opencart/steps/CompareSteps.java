package com.opencart.steps;

import com.opencart.pages.ComparePages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CompareSteps 
{
	ComparePages compares = new  ComparePages();

	@Given("^open the site$")
	public void log() 
	{
		compares.opening() ;
	}

	@When("^compare price of 2 products$")
	public void comparison()
	{
		compares.compare();
	}
}
