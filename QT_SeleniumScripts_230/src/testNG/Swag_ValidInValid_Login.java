package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Swag_ValidInValid_Login {
	WebDriver driver; // Global variable declaration

	// @BeforeTest
	@BeforeMethod
	// @BeforeClass
	public void BrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void Swag_VU_IVP() throws InterruptedException {

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ashfajfaj");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

	}

	// @AfterTest
	@AfterMethod
	// @AfterClass
	public void BrowserClose() {
		driver.close();
	}

}
