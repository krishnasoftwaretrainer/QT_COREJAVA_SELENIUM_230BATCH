package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_SwagLogin {
	WebDriver driver; // Global variable declaration

	// @BeforeTest
	@BeforeMethod
	// @BeforeClass
	public void BrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.comm/");
	}

	//Test case=1=Fail 
	@Test(priority = 1)
	public void Swag_VU_VP(String URL) throws InterruptedException
	{
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL, "URL is not matching, Test Failed");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user123");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		String expectedURL1 = "https://www.saucedemo.com/inventory.html";
		String actualURL1 = driver.getCurrentUrl();
		
		//Hard Assert
		Assert.assertEquals(actualURL1, expectedURL1, "URL is not matching, Login Failed");
		
	}
	
//Test case=2
	@Test(priority = 2,enabled = false)
	public void Swag_IVU_IVP() throws InterruptedException {

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("xdgdfgd");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sdgdsg");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String actualErrorMessage = errorMessage.getText();
		
		//Hard Assert
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message is not matching, Test Failed");
		
	}

	// @AfterTest
	@AfterMethod
	// @AfterClass
	public void BrowserClose() {
		driver.close();
	}

}
