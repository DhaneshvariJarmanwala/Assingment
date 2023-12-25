package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Que_16 {
	/*
	 *  W.a. TestNG program to perform test with webdriver to login process of facebook
	 */
	WebDriver driver=null;
	@BeforeTest
	public void beforsetup() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
    @Test
	public void test() throws InterruptedException {
      driver.findElement(By.id("email")).sendKeys("ravaldhani@gmail.com");
      Thread.sleep(2000);
   	   driver.findElement(By.id("pass")).sendKeys("dhani8488");
   	   Thread.sleep(2000);
	   driver.findElement(By.name("login")).click();
	   Thread.sleep(2000);
	}
	@AfterTest  
	public void aftersetup() {
		System.out.println("its Done .....");
		driver.close();
	}

}
