package hybridFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
public class Hooks_hybrid 
{
public static WebDriver driver;
	@Before
	//@BeforeStep
	public void BrowserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@After
	//@AfterStep
	public void BrowserTearDown()
	{
		if (driver != null) 
		{
		driver.quit();
		}
		

	}
}
