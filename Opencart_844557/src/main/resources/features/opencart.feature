@opencart_Feature 
Feature: Opencart website 
@tc01 
Scenario: RegAndLog
    Given the user launch the browser for valid register
	When the  user opens opencart register page
	Then the user enters the valid register details
	When the  user opens opencart login page
	Then the user enters the valid login details
	Then the user close the login page
	
	Examples:
	|Email ID                  |Password |
	|soundaryariya27@gmail.com |sound    |
	|lakshmikiruba80@gmail.com |kirubakar|
	|elakkiyamsp@gmail.com     |elakkiya |
	|sound                     |sound11  | 

@tc02 
Scenario: Wishlist
	Given the user logged in
	When add items to wishlist
	 
@tc03 Scenario: Comparison
    Given open the site
	When compare price of 2 products
	
@tc04
Scenario: Specials
    Given click specials
	When display special offers
	
@tc05	
 Scenario: Gift
	Given logged in to enter recipient details
	When enter recipient details
	

	
