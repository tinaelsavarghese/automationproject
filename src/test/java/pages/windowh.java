package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class windowh {
	WebDriver driver;
	public windowh(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void kk()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)","");
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
		
		
		
		
		 String parentwindow=driver.getWindowHandle();
		 driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		    
		    
		    Set<String> allwindowhandles = driver.getWindowHandles();
		    for(String handle:allwindowhandles)
		    {
		    	if(!handle.equalsIgnoreCase(parentwindow))
		    	{
		    		driver.switchTo().window(handle);
		    
		    		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
		    		driver.findElement(By.xpath("//*[@id=\"docsearch\"]/button/span[1]/span")).click();
		    		
		    
		    		driver.navigate().back();
		    
		    
		    		driver.close();
		   
		    	}
		    	driver.switchTo().window(parentwindow);
		    
		    }
		
	}
}

	

