package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple {
	WebDriver driver;
	@Test
	public void run() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\E-Backup\\Automation\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://secure.payrollspan.net/");
		driver.manage().window().maximize();
		Loginpage login = new Loginpage(driver);
		login.username();
		login.password();
		login.signin();
		Dashboard click = new Dashboard(driver);
		click.Directory();
		Thread.sleep(3000);
		click.Employee();
		Thread.sleep(3000);
		click.AddEmployee();
		click.another();
	}

}
