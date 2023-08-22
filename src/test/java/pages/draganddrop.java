package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
	WebDriver driver;
	public draganddrop(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void tt()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)","");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a")).click();
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"mongo\"]"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(drag, drop);
		act1.perform();
String k=drop.getText();
		
		if(k.equalsIgnoreCase("dropped!"))
		{
			System.out.println("Dropped");
		
		
	}
		else
		{
			System.out.println("fail");
		}
	
	
	
	}
		
		
}


