package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import hooks.Hooks;
import io.cucumber.java.en.*;

public class SwagInvalid_Login
{
	WebDriver driver=Hooks.driver;
	@When("User enters invalid username {string}  and invalid password {string}")
	public void user_enters_invalid_username_and_invalid_password(String string, String string1) throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string1);
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User should see an error message {string}")
	public void user_should_see_an_error_message(String string2) 
	{
	   WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
	   String actualErrorMessage = errorMessage.getText();
	   Assert.assertEquals(string2, actualErrorMessage); // Pass
	   
	   }

}
