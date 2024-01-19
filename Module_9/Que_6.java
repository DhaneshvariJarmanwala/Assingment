package Module_9;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

/*
 * 6) Write an Appium Program to connect with realdevice using APIDemo.app to perform scrolling the all option
 */
public class Que_6 {
	@Test
public void scrollingrealdevice() throws MalformedURLException, InterruptedException {
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
	 driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
	 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
		
		Thread.sleep(3000);
		driver.quit();
	
}
	
	
}
