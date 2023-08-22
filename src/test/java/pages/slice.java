package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class slice {
	WebDriver driver;
	public slice(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void slide()
	{
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(100,0)","");
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/i")).click();
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[4]/a")).click();
	WebElement slide=driver.findElement(By.xpath("//*[@id=\"slider\"]/a"));
	Actions m =new Actions(driver);
	m.clickAndHold(slide);
	m.moveByOffset(0, -45).build().perform();
	
	
	
	
}

}
