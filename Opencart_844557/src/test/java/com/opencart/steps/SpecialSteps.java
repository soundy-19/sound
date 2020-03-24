package com.opencart.steps;

import com.opencart.pages.SpecialPages;
import com.opencart.pages.WishlistPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SpecialSteps {
	 SpecialPages offer = new  SpecialPages();

		@Given("^click specials$")
		public void logedin() 
		{
			
			offer.open_special() ;
		}

		@When("^display special offers$")
		public void wishes()
		{
			
			offer.offers();
		}
}
