package com.ass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que_4 {
	WebDriver driver=null;
	@BeforeTest
	public void test() {
	
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
			
	driver.get("https://demo.guru99.com/");
	
	driver.manage().window().maximize();
	
	}
	@Test
	public void test1() throws InterruptedException {
	driver.findElement(By.name("emailid")).sendKeys("ravaldhani@gmail.com");
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(2000);
	}
	
	@Test
	public String[][]Guru99() throws InvalidFormatException, IOException{
		String[][] data=null;
		String filepath="D:\\Selenium\\Guru99.xlsx";
		File file=new File(filepath);
		
	 XSSFWorkbook workbook= new XSSFWorkbook(file);
	 
	Sheet sheet=workbook.getSheet("Sheet1");

	int nrow=sheet.getPhysicalNumberOfRows();
	System.out.println("no of row is:"+nrow);
	 
		data=new String[nrow][];
		for (int i = 0; i < data.length; i++) {
			
			Row row=sheet.getRow(i);
			
			int ncell=row.getPhysicalNumberOfCells();
			System.out.println("no of col in each row:"+ncell);
			data[i]=new String[ncell];
			
			for (int j = 0; j < data[i].length; j++) {
			Cell cell=row.getCell(j);
			cell.setCellType(CellType.STRING);
			data[i][j]=cell.getStringCellValue();
				
		
			}
			}
			return data;
	}
		
		@Test
		public void test2() throws InvalidFormatException, IOException, InterruptedException {
			String[][] data=Guru99();
			WebDriver driver;
			
			System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
			
			for (int i = 0; i < data.length; i++) {
				
			 driver=new EdgeDriver();
					
			driver.get("https://www.demo.guru99.com/V4/");
			
			driver.manage().window().maximize();
			
		driver.findElement(By.name("uid")).sendKeys(data[i][0]);
		driver.findElement(By.name("password")).sendKeys(data[i][1]);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
			
			}
		}
		@Test
		public void test3() throws InterruptedException, IOException {
			
			
			File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
			
			Files.copy(file,new File("D:\\Selenium\\SS\\defect2.png"));
			
			System.out.println("This is Pass Test....");
			Thread.sleep(2000);
			driver.close();
			
			
		}
		

}
		