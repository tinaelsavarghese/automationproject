package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class datepicker {
	WebDriver driver;
	public datepicker(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void date()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)","");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"));
			String month1=month.getText();
			if(month1.equals("August 2023"))
			{
				System.out.println(month1);
				break;
				
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
				
			}
		}
		
			
	       List<WebElement> alldates1 = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement dateelement:alldates1)
		{
			String date=dateelement.getText();
			//System.out.println(date);
			if (date.equals("25"))
               {
				System.out.println(date);
	            dateelement.click();
                System.out.println("date selected");
	
}
		}
		
	}
}
	