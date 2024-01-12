package com.project;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Login {
	public void eneterloginname(WebDriver driver,String eneterloginname) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(eneterloginname);
		Thread.sleep(2000);
	}
	public void eneterloginpassword(WebDriver driver,String eneterloginpassword) throws InterruptedException
	{
		driver.findElement(By.name("password")).sendKeys(eneterloginpassword);
		Thread.sleep(2000);
	}
	public void clicklogin(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://parabank.parasoft.com/parabank/register.htm"))
		{
			System.out.println("Your Login Test Has been Passed...");
		}
		else
		{
			System.out.println("Your Login Test Has been Failed...");
			fail("Login Failed");
		}
		
			
		}
	
	}		



