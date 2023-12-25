package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddDemo1 {
	public void login(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("url is : " +driver.getCurrentUrl());
		System.out.println("title is : " +driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		
		System.out.println("bYe.. BYe..");
		driver.close();
		
	}
}
