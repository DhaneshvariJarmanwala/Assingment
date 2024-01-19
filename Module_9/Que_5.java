package Module_9;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/*
 * 5) Write an Appium Program to connect with realdevice using APIDemo.app to perform longpress to open to side menu.
 */
public class Que_5  {
@Test
	public void realdevicelongpress() throws MalformedURLException, InterruptedException {
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
			driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
			Thread.sleep(2000);

			WebElement e1=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
			
			
				((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
						ImmutableMap.of("elementId",((RemoteWebElement)e1).getId(),
								"duration",2000));
			
				
			String msg=driver.findElement(By.id("android:id/title")) .getText();
			Assert.assertEquals(msg, "Sample menu");
			Thread.sleep(3000);
			driver.quit();

	}
}
