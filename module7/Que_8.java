package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que_8 {
	/*
	 * W.A.J. script To write the script for image of logo facebook using xpath.
	 */
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		
        WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("url is : " +driver.getCurrentUrl());
		System.out.println("title is : " +driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("dhani");
	    Thread.sleep(2000);
		   
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("8488");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
				
	    driver.close();
	    
	}
	
}
