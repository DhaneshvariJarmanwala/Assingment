package Module_9;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

/*
 * 3) Write an Appium Program to connect with emulator wit ecommerce based application using 
 * Generalstore.app to perform locators like name, dropdown etc.
 */
public class Que_3 extends BaseTest1{
	@Test
public void Generalstore() throws InterruptedException {
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Dhaneshvari");
	Thread.sleep(2000);
	driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	Thread.sleep(2000);
driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
	Thread.sleep(3000);

	System.out.println("enjoy your shopping...");
}

}

