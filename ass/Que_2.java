package com.ass;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que_2 {
	WebDriver driver=null;
	@BeforeTest
	public void test() {
	
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
			
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	
	driver.manage().window().maximize();
	
	}
	@Test
	public void test2() throws InterruptedException {
		
	
	List<WebElement> th= driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th"));
	
	System.out.println("no of col is :"+th.size());
	
	List<WebElement> tr= driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr"));
	
	System.out.println("no of row is :"+tr.size());
		
	for (int i = 1; i <=th.size(); i++) {
		
		String thname=driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th["+i+"]")).getText();
		System.out.print("      |      "+thname);
	}
	System.out.println();

for (int i = 1; i <=8; i++) {
	for (int j = 1; j <= 6; j++) {
		
		String data=driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		
		System.out.print("      |     "+data);
		Thread.sleep(1000);

	}
	System.out.println();
}
	
driver.close();
	
}



	}	
	