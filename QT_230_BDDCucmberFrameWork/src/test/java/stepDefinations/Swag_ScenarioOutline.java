package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Swag_ScenarioOutline {
	WebDriver driver;

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

	}

	@When("The user enters a  username {string}")
	public void the_user_enters_a_username(String username) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
	}

	@And("The user enters a  password {string}")
	public void the_user_enters_a_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("The user clicks the login button")
	public void the_user_clicks_the_login_button() throws InterruptedException {

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("The user should see the result page")
	public void the_user_should_see_the_result_page() throws InterruptedException {
		String actuvalURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/inventory.html";

		if (actuvalURL.equals(expectedURL)) {
			System.out.println("Login is successful");
			Thread.sleep(2000);
		} else {

			WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
			String actuvalerrormessage = errorMessage.getText();
			System.out.println("Login is unsuccessful" + actuvalerrormessage);
			Thread.sleep(2000);

		}

		driver.quit();
	}

}
