package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.Hooks;
import io.cucumber.java.en.*;

public class SwagValid_Login {
	
	WebDriver driver=Hooks.driver;

	@Given("User is on the Swag Labs Login Page")
	public void user_is_on_the_swag_labs_login_page() throws InterruptedException {
		
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();

		Assert.assertEquals(expectedURL, actualURL); // Pass
	}

	@When("User enters valid username {string}")
	public void user_enters_valid_username(String string) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(string);
		Thread.sleep(2000);

	}

	@And("User enters valid password {string}")
	public void user_enters_valid_password(String string) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys(string);
		Thread.sleep(2000);

	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

	}

	@Then("User should be navigated to the Swag Labs Inventory Page")
	public void user_should_be_navigated_to_the_swag_labs_inventory_page() {

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();

		Assert.assertEquals(expectedURL, actualURL); // Pass
		driver.quit();
	}

}
