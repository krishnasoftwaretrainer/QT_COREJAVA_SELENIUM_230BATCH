package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_IsDisplayed_IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Check Box:Cricket
		WebElement Cricket=driver.findElement(By.id("checkbox1"));
		//Cricket.click(); //Selected
		if(!Cricket.isSelected() && Cricket.isDisplayed() && Cricket.isEnabled())
		{
			Cricket.click();
		}
		
		Thread.sleep(2000);
		//Check Box:Movies
		WebElement Movies=driver.findElement(By.id("checkbox2"));
		//Movies.click();
		if(!Movies.isSelected() && Movies.isDisplayed() && Movies.isEnabled())
		{
			Movies.click();
		}
		//Check Box:Hockey
		WebElement Hockey=driver.findElement(By.id("checkbox3"));
		//Hockey.click();
		if(!Hockey.isSelected() && Hockey.isDisplayed() && Hockey.isEnabled())
		{
			Hockey.click();
		}
	}

}
