package pages;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class datadrivenexcel {
	WebDriver driver;
	public datadrivenexcel(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void dataclick() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)","");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
	}
	
		public void datadriven() throws IOException
		{
		
		
			File f=new File("C:\\Users\\User\\Desktop\\tina java\\Book1.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb= new XSSFWorkbook(fi);

			XSSFSheet sh=wb.getSheet("Sheet1");
			System.out.println(sh.getLastRowNum());

			for(int i=1;i<=sh.getLastRowNum();i++)
			{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password"+pswd);

			driver.findElement(By.xpath("/html/body/div/div/div[2]/input")).clear();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/input")).sendKeys(username);
			driver.findElement(By.xpath("/html/body/div/div/div[3]/input")).clear();
			driver.findElement(By.xpath("/html/body/div/div/div[3]/input")).sendKeys(pswd);
			   
			driver.findElement(By.xpath("//*[@id=\"enterbtn\"]")).click();
			   
		    
		}

		}

}
