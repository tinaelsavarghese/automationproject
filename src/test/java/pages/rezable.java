package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rezable {
	WebDriver driver;
	public rezable(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void resize()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)","");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[3]/a")).click();
		WebElement size=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions k =new Actions(driver);
		k.clickAndHold(size);
		k.moveByOffset(0, -45).build().perform();
		
		
		
		
	}
	
	
	
}
