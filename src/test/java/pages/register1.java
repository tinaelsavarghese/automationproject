package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class register1 {
	WebDriver driver;
	By name=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By lastname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By address=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By email=By.xpath("//*[@id=\"eid\"]/input");
	By phone=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	
	By gender=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]");
	
	By hobb=By.xpath("//*[@id=\"checkbox1\"]");
	By lan=By.xpath("//*[@id=\"msdd\"]");
	By languages=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[2]");
	By ski=By.xpath("//*[@id=\"Skills\"]/option[12]");
	By cn=By.xpath("//*[@id=\"countries\"]/option");
	By coun=By.xpath("//*[@id=\"country\"]/option[6]");
	
	
	
	By yearelement=By.xpath("//*[@id=\"yearbox\"]/option[83]");
	
	 
	 By monthelement=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[11]");
	 
	 By dayelement=By.xpath("//*[@id=\"daybox\"]/option[16]");
	 
	 By pass=By.xpath("//*[@id=\"firstpassword\"]");
	 By conf=By.xpath("//*[@id=\"secondpassword\"]");
	 
	 By sub=By.xpath("//*[@id=\"submitbtn\"]");
	 
	 
	
	
	public register1(WebDriver driver)
	{
	this.driver=driver;
	}
	public void setvalues(String nam,String lname,String add,String em,String kk)
	{
	driver.manage().window().maximize();
	
	driver.findElement(name).sendKeys(nam);
	driver.findElement(lastname).sendKeys(lname);
	driver.findElement(address).sendKeys(add);
	driver.findElement(email).sendKeys(em);
	driver.findElement(phone).sendKeys(kk);
	}
	public void radio()
	{
		driver.findElement(gender).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
	}
	public void hobbies()
	{
		
		driver.findElement(hobb).click();
		driver.findElement(lan).click();
	    driver.findElement(languages).click();
	    driver.findElement(ski).click();
	    driver.findElement(coun).click();
	    driver.findElement(cn).click();
	    
	}
	
	public void dropdown()
	{
		 driver.findElement(yearelement).click();
		 driver.findElement(monthelement).click();
		 driver.findElement(dayelement).click();
	}
	public void passw(String pas,String pw) {
		driver.findElement(pass).sendKeys(pas);
		driver.findElement(conf).sendKeys(pw);
	}
	public void submit() {
		driver.findElement(sub).click();
	}

}
