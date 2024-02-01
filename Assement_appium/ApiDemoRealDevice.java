package Assement_appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ApiDemoRealDevice {
	@Test
private void click() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "realme RMX3151");
	cap.setCapability("udid", "AMBQSWLVPVVWEAVK");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformverson","12.0");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	cap.setCapability("automationName", "UIAutomator2");
	
	URL url=new URL("http://127.0.0.1:4723/");
	
	AppiumDriver driver=new AppiumDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 Thread.sleep(2000);
	 driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		 driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		Thread.sleep(2000);
		driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("App")).click();
			Thread.sleep(2000);
     		driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Content")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Media")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("NFC")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("OS")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Text")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			driver.quit();
			
			
}
}
