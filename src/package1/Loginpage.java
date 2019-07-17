package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By username = By.id("EmailAddress");
	By password = By.id("Password");
	By signin   = By.id("btnsignin");
	
	public Loginpage(WebDriver driver){
		this.driver = driver;
	}
	
	public void username(){
		driver.findElement(username).sendKeys("arunkumar.dhanasekar+always2@spanllc.com");
	}

	public void password(){
		driver.findElement(password).sendKeys("Arun@123");
	}
	
	public void signin(){
		driver.findElement(signin).click();
	}
}
