package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class fileupload {

	WebDriver driver;
	public fileupload(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
	public void as() throws Exception
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1000,0)","");
		driver.findElement(By.xpath("//*[@id=\"section\"]/div/div/div[3]/div[2]")).click();
		fileUploads("C:\\Users\\User\\Desktop\\jj.jpg");
	}
	public void fileUploads(String p) throws AWTException
	{
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	Robot robot =new Robot();
	robot.delay(3000);

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	

	}
}

