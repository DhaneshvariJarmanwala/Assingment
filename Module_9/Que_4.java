package Module_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

/*
 * 4) Write an Appium Program to connect with emulator wit ecommerce based application using 
*Generalstore.app to perform swipe demo to swipe the menu.
 */
public class  Que_4 extends BaseTest1{
@Test
	public void Swipe() throws InterruptedException {
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	Thread.sleep(2000);
	
	for (int i = 1; i < 3; i++) {
		
		WebElement ele=driver.findElement(By.xpath("//android.widget.ImageView["+i+"]"));
		Thread.sleep(2000);
		swipeAction(ele, "left");
		Thread.sleep(2000);
	}
}

		
	}
	


