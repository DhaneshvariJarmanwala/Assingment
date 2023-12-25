package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que_3 {
	/*
	 *  W.A.J.Script for Selecting multiple items in a drop dropdown
	 */
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
				
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.id("fruits"));
		
	    Select option =new Select(ele);
	    
	    option.selectByValue("apple");
	    Thread.sleep(2000);
	    
	    option.selectByIndex(0);
	    Thread.sleep(2000);
	    
	    option.selectByVisibleText("Grape");
	    Thread.sleep(2000);
	    
	    driver.close();
	    
}
}
