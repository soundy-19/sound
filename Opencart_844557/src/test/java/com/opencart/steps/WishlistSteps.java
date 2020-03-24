package com.opencart.steps;

import com.opencart.pages.WishlistPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class WishlistSteps 
{	
		 WishlistPages lists = new  WishlistPages();

		@Given("^the user logged in$")
		public void logedin() 
		{
			
			lists.loginpass() ;
		}

		@When("^add items to wishlist$")
		public void wishes()
		{
			
			lists.wish();
		}
}


