package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Que_20 {
	/*
	 * w.a. TestNG program to create dataprovider.
	 */
	@DataProvider(name="dhani")
	public Object input() {
		
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
				
	}


		@Test(dataProvider = "dhani")
		
		 public void f(String username,String password) throws InterruptedException {
			  WebDriver driver;
				
				
				System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
				
				 driver=new EdgeDriver();
						
				driver.get("https://www.saucedemo.com");
				
				driver.manage().window().maximize();
				

		driver.findElement(By.id("user-name")).sendKeys(username);
					 Thread.sleep(2000);
					 
			
					 driver.findElement(By.id("password")).sendKeys(password);
					 Thread.sleep(2000);
					 driver.findElement(By.id("login-button")).click();
					 Thread.sleep(2000);
					
						
					 

					 driver.findElement(By.id("react-burger-menu-btn")).click();
					 Thread.sleep(2000);
					
					 driver.findElement(By.id("logout_sidebar_link")).click();
					 Thread.sleep(2000);
					
				System.out.println("bye bye");	
				
				driver.close();
				
		  }

		
		

}

