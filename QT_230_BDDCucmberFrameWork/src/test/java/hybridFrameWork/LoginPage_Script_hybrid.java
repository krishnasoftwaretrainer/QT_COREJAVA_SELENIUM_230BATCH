package hybridFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Script_hybrid {
	
	WebDriver driver = Hooks_hybrid.driver;

	POM_LoginPage_hybrid pom = new POM_LoginPage_hybrid();

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		// Browser already launched from Hooks
		Thread.sleep(2000); 
	}

	@When("The user enters a  username {string}")
	public void the_user_enters_a_username(String user) throws InterruptedException {
		pom.enterUsername(user);
		Thread.sleep(2000);
	}

	@And("The user enters a  password {string}")
	public void the_user_enters_a_password(String pass) throws InterruptedException {
		pom.enterPassword(pass);
		Thread.sleep(2000);
	}

	@And("The user clicks the login button")
	public void the_user_clicks_the_login_button() throws InterruptedException {
		pom.clickLogin();
		Thread.sleep(2000);
	}

	@Then("The user should see the result page")
	public void the_user_should_see_the_result_page() throws InterruptedException {
		String actualURL = Hooks_hybrid.driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/inventory.html";

		if (actualURL.equals(expectedURL)) 
		{
			System.out.println("Login is successful");
		Thread.sleep(2000);
		} 
		
		else 
		{
			WebElement errorMessage = Hooks_hybrid.driver.findElement(By.cssSelector("h3[data-test='error']"));

			System.out.println("Login failed: " + errorMessage.getText());
			Thread.sleep(2000);
		}
	}

}
