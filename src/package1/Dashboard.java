package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	WebDriver driver;
	By Directory = By.id("aPeople");
	By Employee  = By.id("aEmployeeuser");
	By Addemployee = By.xpath("//button[@class='btn btn_sm btn_primary floatR']");
	
	public Dashboard(WebDriver driver){
		this.driver=driver;
	}

	public void Directory(){
		driver.findElement(Directory).click();
	}
	public void Employee(){
		driver.findElement(Employee).click();
	}
	public void AddEmployee(){
		driver.findElement(Addemployee).click();
	}
	public void another(){
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kemar");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Roach");
		
	}
}
