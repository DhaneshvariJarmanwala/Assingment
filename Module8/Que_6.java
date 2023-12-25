package Module8;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * W.a.framework program for hybrid driven framework
 */
public class Que_6 {
	@DataProvider(name="dhani")
	public Object[][] radExcel() throws InvalidFormatException, IOException {
		
		Object[][] data=null;
		String filepath="D:\\Selenium\\read_data.xlsx";
		File file=new File(filepath);
		
	 XSSFWorkbook workbook= new XSSFWorkbook(file);
	 
	Sheet sheet=workbook.getSheet("Sheet4");

	int nrow=sheet.getPhysicalNumberOfRows();
	System.out.println("no of row is:"+nrow);
	 
		data=new Object[nrow][];
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
	WebDriver driver=null;
	@Test(dataProvider = "dhani")
	public void test(String keyword,String data )throws InvalidFormatException, IOException, InterruptedException {
		
		
		
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		
		
			
		
		if(keyword.equals("Open Browser")) {
		 driver=new EdgeDriver();
				
		}
		 else if (keyword.equals("enter Url")) {
			
		
		 
		driver.get(data);
		
		driver.manage().window().maximize();
		}	
		
			
		else if (keyword.equals("Username")) {
			
	
			
	driver.findElement(By.id("user-name")).sendKeys(data);
			 Thread.sleep(2000);
		}	 

		
		else if (keyword.equals("Password")) {
			
		
			 driver.findElement(By.id("password")).sendKeys(data);

			 Thread.sleep(2000);
		}
		else if (keyword.equals("LoginButton")) {
			
		
			 driver.findElement(By.id("login-button")).click();
			 Thread.sleep(2000);
			
		}	
			 
		else if (keyword.equals("Menu")) {
			
	
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 Thread.sleep(2000);
		}
		else if (keyword.equals("Logout")) {
			
		
			 driver.findElement(By.id("logout_sidebar_link")).click();
			 
			 Thread.sleep(2000);
			 
			 
			
		System.out.println("Done Dude");	
		
		driver.close();
		}
		}	



}
