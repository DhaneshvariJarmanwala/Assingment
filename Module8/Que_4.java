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
import org.testng.annotations.Test;

/*
 * W.a.framework program for data driven framework
 */
public class Que_4 {
	public String[][] radExcel() throws InvalidFormatException, IOException {
		
		String[][] data=null;
		String filepath="D:\\Selenium\\read_data.xlsx";
		File file=new File(filepath);
		
	 XSSFWorkbook workbook= new XSSFWorkbook(file);
	 
	Sheet sheet=workbook.getSheet("Sheet2");

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
	public void test() throws InvalidFormatException, IOException, InterruptedException {
		String[][] data=radExcel();
		WebDriver driver;
		
		
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		
		for (int i = 0; i < data.length; i++) {
			
		
		
		 driver=new EdgeDriver();
				
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		

	driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
			 Thread.sleep(2000);
			 

			 driver.findElement(By.id("password")).sendKeys(data[i][1]);
			 Thread.sleep(2000);
			 driver.findElement(By.id("login-button")).click();
			 Thread.sleep(2000);
			
				
			 

			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("logout_sidebar_link")).click();
			 
			 Thread.sleep(2000);
			 
			 
			
		System.out.println("bye bye");	
		
		driver.close();
		}	
	}


		
		
		
		
		
		

}
