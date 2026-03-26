package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLoginPage 
{
	WebDriver driver; //Global variable declaration
	
	//@BeforeTest
	@BeforeMethod
	//@BeforeClass
	public void BrowserLaunch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority = 0)
	public void Swag_VU_VP() throws InterruptedException
	{
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
	}
	@Test(priority = 1)
	public void Swag_IVU_IVP()
	{
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("invalid");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("invalid");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
	}
	
	@Test(priority = 2)
	public void Swag_VU_IVP() throws InterruptedException
	{
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("invalid");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 3)
	public void Swag_IVU_VP() throws InterruptedException
	{
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("invalid");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(3000);
		
	}
	//@AfterTest
	@AfterMethod
	//@AfterClass
	public void BrowserClose()
	{
		driver.close();
	}
	
	/*  
	 * 
	 * @BeforeClass and @AfterClass
	 * @BeforeTest and @AfterTest
	 * @BeforeMethod and @AfterMethod
	 * 
	 */
	

}
