package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;

public class Hooks 
{
	public static WebDriver driver;
	
	//@Before
	@BeforeStep
	public void BrowserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	//@After
	@AfterStep
	public void BrowserTearDown()
	{
		if (driver != null) 
		{
		driver.quit();
		}
		
	}

}
