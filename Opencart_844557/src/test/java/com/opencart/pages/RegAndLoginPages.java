package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegAndLoginPages 
{

	WebDriver driver;
	By my_account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By first_name=By.name("firstname");
	By last_name=By.name("lastname");
	By email=By.name("email");
	By telephone=By.name("telephone");
	By password=By.name("password");
	By confirm=By.name("confirm");
	By agree=By.name("agree");
	By register_submit=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By login_email=By.name("email");
	By login_password=By.name("password");
	By login_submit=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	public void url(String browser) 
	{
		try
		{
			//to launch chrome browser 
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
			//to launch firefox browser
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.manage().window().maximize(); //maximize the window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //code will wait for specified time before execution
			
		}
		
		catch(WebDriverException e)
		{
			//browser could not be launched and so this statement will be displayed
			System.out.println("Browser could not be launched");
		}
		
		driver.get("https://demo.opencart.com/"); //get url from user

	}
	
	public void opencart_register()
	{
		driver.findElement(my_account).click(); //click my account
		driver.findElement(register).click(); //select register from my account
	}
	
	public void register_details() throws InterruptedException
	{
		driver.findElement(first_name).sendKeys("sound"); //get first name from user
		driver.findElement(last_name).sendKeys("m"); //get last name from user
		driver.findElement(email).sendKeys("soundaryariya27@gmail.com"); //get email from user
		driver.findElement(telephone).sendKeys("1234567890"); //get telephone from user
		driver.findElement(password).sendKeys("sound"); //get password from user
		driver.findElement(confirm).sendKeys("sound"); //confirms the entered password
		driver.findElement(agree).click(); //agree to the terms and condition
		driver.findElement(register_submit).click(); //click the submit button
		Thread.sleep(3000); 
	}
	public void opencart_login()
	{
		driver.findElement(my_account).click();//click my account
		driver.findElement(login).click();//select login
	}
	
	public void login_details(String emailid,String pass) throws InterruptedException
	{
		driver.findElement(login_email).sendKeys(emailid);//get email id from user
		driver.findElement(login_password).sendKeys(pass);//get password id from user
		driver.findElement(login_submit).click();//click submit button
		Thread.sleep(3000);
	}
	public void quit()
	{
		driver.close();//close the browser
	}
	
}
