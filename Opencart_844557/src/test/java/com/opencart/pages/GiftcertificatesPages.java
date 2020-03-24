package com.opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftcertificatesPages
{
	
WebDriver driver;
	

	public void login_pass() 
	{
		System.setProperty("webdriver.chrome.driver", "/Opencart_844557/Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("soundaryariya27@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sound");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();

	}

	public void recipient() 
	{
		
		driver.findElement(By.name("to_name")).sendKeys("Sound");
		driver.findElement(By.name("to_email")).sendKeys("sound@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/div[1]/label/input")).click();
		driver.findElement(By.id("input-message")).sendKeys("I love you and so here is your birthday present from me. Hope you love it.");
		driver.findElement(By.name("amount")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[2]")).click();
		
	}
	
}
