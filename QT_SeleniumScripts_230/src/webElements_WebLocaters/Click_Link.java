package webElements_WebLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ForgottenPassword=driver.findElement(By.linkText("Forgotten password?"));
		ForgottenPassword.click();
		
		String URL=driver.getCurrentUrl();
		String Title=driver.getTitle();
		
		System.out.println("Current URL is: "+URL);
		System.out.println("Current Title is: "+Title);
		
	}

}
