package com.project;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MainTest {
	WebDriver driver=null;
	Registration lp=null; 
	Login rp=null;
	@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new BrowserConfigration().ChromeBrowserSelection("chrome", "https://parabank.parasoft.com/parabank/register.htm");
		Thread.sleep(3000);
	}
	@BeforeTest
	public void beforetest()
	{
		lp=new Registration();
		rp=new Login();
	}
	@Test(priority = 0)
	public void Registation() throws InterruptedException
	{
		lp.enterfirstname(driver, "Dhaneshvari");
		lp.enterlastname(driver, "Jarmanwala");
		lp.enterAddress(driver, "B/14,MadhramApt,Adajan");
		lp.entercity(driver, "Surat");
		lp.enterstate(driver, "Gujrat");
		lp.enterzipcode(driver, "395009");
		lp.enterphonenumber(driver, "8141011181");
		lp.enterssn(driver, "Indian");
		lp.enterusername(driver, "mahin_8488");
		lp.enterpassword(driver, "dhani8488");
		lp.enterrepeatedpassword(driver, "dhani8488");
		lp.clickregister(driver);
		System.out.println("your Registation has been Done...");
	}
	@Test(priority = 1)
	public void login() throws InterruptedException, IOException {
		
		rp.eneterloginname(driver, "mahin_8488");
		rp.eneterloginpassword(driver, "dhani8488");
		rp.clicklogin(driver);
	}
	@Test(priority = 2)
	public void ss() throws IOException, InterruptedException {
		
	
	File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	
	Files.copy(file,new File("D:\\Selenium\\SS\\defect5.png"));
	
	Thread.sleep(2000);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		System.out.println("Bye Bye...");
		Thread.sleep(3000);
		driver.close();		
	}
}

