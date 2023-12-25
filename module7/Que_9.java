package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Que_9 {
	/*
	 * W.A.J.Script To use Mouse event using Action class
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
				
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement flights=driver.findElement(By.linkText("Flights"));
		WebElement hotel=driver.findElement(By.linkText("Hotels"));
		
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(flights).build();
		a2.perform();
		Thread.sleep(2000);
		
		Action a3=actions.moveToElement(hotel).build();
		a3.perform();
		Thread.sleep(2000);
		
		driver.close();
	}
		

}
