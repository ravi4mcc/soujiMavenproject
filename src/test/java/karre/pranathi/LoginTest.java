package karre.pranathi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
	}
	
	@Test
	public void dologin()
	{
		driver.get("http://gmail.com");
		System.out.println("Hello");
	}
	
}
