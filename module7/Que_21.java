package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Que_21 {
  @Test
  @Parameters({"email","password"})
  public void f(String email,String password) throws InterruptedException {
	  WebDriver driver;
		
		
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		
		 driver=new EdgeDriver();
				
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
  
driver.findElement(By.id("email")).sendKeys(email);
			 Thread.sleep(2000);
			 
	
			 driver.findElement(By.id("pass")).sendKeys(password);
			 Thread.sleep(2000);
			 driver.findElement(By.id("login")).click();
			 Thread.sleep(2000);
			

			 
		System.out.println("bye bye");	
		
		driver.close();
		
}  


  }

