package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que_2 {
	/*
	 *  W.A.J.Script for Locating links by partialLinkText()
	 */
	
	 public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
			
			driver.get("D:\\Core_Java\\Selenium\\src\\com\\webdriver\\index.html");
			
			driver.manage().window().maximize();
			
			System.out.println("url is : " +driver.getCurrentUrl());
			System.out.println("title is : " +driver.getTitle());
			
			Thread.sleep(2000);
		
			driver.findElement(By.partialLinkText("He")).click();
			
			Thread.sleep(2000);
			driver.close();
			
	 }
}
