package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que_1 {
	/*
	 * W.A.J.Script for Locating links by linkText()
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("url is : " +driver.getCurrentUrl());
		System.out.println("title is : " +driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
