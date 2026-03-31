package selenium_Concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/*
		//Implicit Wait->Global Wait->It will be applicable for all the web elements which are present in the webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		WebElement Products=driver.findElement(By.id("products-dd-toggle"));
		Actions action=new Actions(driver);
		
		action.moveToElement(Products).build().perform();
		
		WebElement WebTesting=driver.findElement(By.id("products-dd-tab-2"));
		action.moveToElement(WebTesting).build().perform();
		
		WebElement Live=driver.findElement(By.linkText("Live"));
		action.moveToElement(Live).click().build().perform();
		*/
		//Explicit Wait->It is applicable for a particular web element
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		WebElement Products=wait.until(ExpectedConditions.elementToBeClickable(By.id("products-dd-toggle")));
		Actions action=new Actions(driver);
		action.moveToElement(Products).build().perform();
	}

}
