package Module8;



import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

/*
 * W.a.maven program to create Junit with webdriver Program
 */
public class Que_2 {
	
	WebDriver driver;
	@BeforeTest
	public void beforesetup() {
		
	
	System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
	
	 driver=new EdgeDriver();
			
	driver.get("https://www.saucedemo.com/v1/");
	
	driver.manage().window().maximize();
	
	}
	@Test
	public void test() throws InterruptedException, IOException {
		System.out.println("url is :"+ driver.getCurrentUrl());
		 System.out.println(" title is :"+ driver.getTitle());
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 Thread.sleep(2000);
		
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(2000);
	
	
		
	}
	
	@AfterClass
	public void aftersetup() {
	System.out.println("bye bye");	
	
	driver.close();
	
	}

}
