package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que_7 {
	/*
	 * W.A.J. Script To perform the radio button to select one by one in loop
	 */
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		System.out.println("url is : " +driver.getCurrentUrl());
		System.out.println("title is : " +driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-1")).click();
		
		for (int i =1; i <=3 ; i++) {
			driver.findElement(By.id("vfb-7-"+i)).click();
			Thread.sleep(2000);
			
		}
		
		driver.close();
		
}

}
