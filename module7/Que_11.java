package module7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Que_11 {
	/*
	 * W.A.J. Script To find the total hyperlink from this web page
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
				
				WebDriver driver=new EdgeDriver();
						
				driver.get("https://demo.guru99.com/test/web-table-element.php");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
					
				
			List<WebElement> th= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
						
				System.out.println("no of col is :"+th.size());
				
				List<WebElement> tr= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
				
				System.out.println("no of row is :"+tr.size());
					
				for (int i = 1; i <=th.size(); i++) {
					
					String thname=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
					System.out.print("      |      "+thname);
				}
				System.out.println();

			for (int i = 1; i <=tr.size(); i++) {
				for (int j = 1; j <= th.size(); j++) {
					
					String data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					
					System.out.print("      |     "+data);
					Thread.sleep(1000);

				}
				System.out.println();
			}
				
			Thread.sleep(2000);
			driver.close();
				
			}
			
			

}
