package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Verification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		Thread.sleep(2000); // Wait for 2 seconds
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/"); // Step3:Enter Amazon URL
		//driver.get("https:www.facebook.com/"); 
		Thread.sleep(2000); // Wait for 5 seconds

		// Smoke Testing: Verify URL of Amazon HomePage

		String ExceptedURL = "https://www.amazon.in/";
		String ActuvalURL = driver.getCurrentUrl(); // Get Current URL of Amazon HomePage

		System.out.println("Excepted URL is: " + ExceptedURL);
		System.out.println("Actual URL is: " + ActuvalURL);
		if (ExceptedURL.equals(ActuvalURL)) // True
		{
			System.out.println("Smoke Testing is Passed, URL is matched");
		} else {
			System.out.println("Smoke Testing is Failed, URL not matched");
		}
		Thread.sleep(2000);
		driver.close(); // Close Browser
	}

}
