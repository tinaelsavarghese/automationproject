package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.alert;
import pages.datadrivenexcel;
import pages.datepicker;
import pages.draganddrop;
import pages.fileupload;
import pages.register1;
import pages.rezable;
import pages.screenshot;
import pages.slice;
import pages.windowh;

public class testpage {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void url()
	{
		
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@Test
	public void testlogin() throws Exception 
	{
		register1 ob=new register1(driver);
		ob.setvalues("tina", "varghese", "areekattu house ", "tinaelsa97@gmail.com", "9754333322");
		ob.radio();
		ob.hobbies();
		ob.dropdown();
		ob.passw("kkkk", "kkkk");
		ob.submit();
	    fileupload ob2=new fileupload(driver);
	    ob2.as();
	    
	   // ob2.fileUploadd("C:\\Users\\User\\Desktop\\jj.jpg");
		alert ob3=new alert(driver);
		ob3.ss();
		
	    draganddrop ob5=new draganddrop(driver);
		ob5.tt();
		rezable ob6=new rezable(driver);
	    ob6.resize();
	    slice ob7=new slice(driver);
	    ob7.slide();
		
		windowh ob4=new windowh(driver);
		ob4.kk();
		datepicker ob8=new datepicker(driver);
		ob8.date();
		datadrivenexcel ob9=new datadrivenexcel(driver);
		ob9.dataclick();
		ob9.datadriven();
		screenshot ob10=new screenshot(driver);
		ob10.dataclick();
		ob10.testk();
	}
	
	
	
}
