package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparePages
{
	
WebDriver driver;
	public void opening() 
	{
		System.setProperty("webdriver.chrome.driver", "/Opencart_844557/Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
	}

	public void compare() 
	{
		
		String a=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/p[2]")).getText();
		String b=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/p[2]")).getText();
		System.out.println(a);
		System.out.println(b);
		
	}
	
}

	
