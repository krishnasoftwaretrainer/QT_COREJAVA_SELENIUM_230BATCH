package stepDefinations;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import io.cucumber.java.en.Then;

public class SwagBlank_Login 
{
	 WebDriver driver=Hooks.driver;
	@Then("User should be navigated to an error message")
	public void user_should_be_navigated_to_an_error_message()
	{
		 WebElement errorMessage = driver.findElement(By.xpath("//h3[text()=\"Epic sadface: Username is required\"]"));
		 String excepetdErrorMessage="Epic sadface: Username is required";  
		 String actualErrorMessage = errorMessage.getText();
		   Assert.assertEquals(excepetdErrorMessage, actualErrorMessage); // Pass
	}


}
