package pages;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot {
	WebDriver driver;
	public screenshot(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void dataclick() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)","");
	}
		public void testk() throws Exception
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:\\Users\\User\\Desktop\\tina java//aa.png"));
		}
}
