package module7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Que_4 {
	/*
	 *  W.A.J. script to use different methods to manage the windows-alerts
	 */
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
				
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
			
		driver.findElement(By.name("cusid")).sendKeys("123");
		
		Thread.sleep(2000);
		
		
     driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println("alert msg is:"+a1.getText());
	//	a1.dismiss();
		
		a1.accept();

		Thread.sleep(2000);
		
		Alert a2=driver.switchTo().alert();
		System.out.println("alert msg is:"+a2.getText());
		a2.accept();

		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
