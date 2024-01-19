package Module_9;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

/*
 * 1) Write an Appium Program to connect with emulator and open APIdemo.app application on your emulator

 */
public class Que_1 {
	@Test
public void emulator() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Dhaneshvari");
	options.setApp("D:\\Appium\\apk file\\ApiDemos-debug.apk");
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
