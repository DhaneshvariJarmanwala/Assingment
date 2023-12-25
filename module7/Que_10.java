package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Que_10 {
	/*
	 * W.A.J.Script To use keyboard event using Action class
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
				
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(email).click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys("Dhani")
				.keyUp(email,Keys.SHIFT).doubleClick().contextClick()
				.build();
		
		a1.perform();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
