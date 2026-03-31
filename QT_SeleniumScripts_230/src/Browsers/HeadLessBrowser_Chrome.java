package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser_Chrome {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Enable headless mode
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(2000); // Wait for 2 seconds
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.get("https://www.amazon.in/"); // Step3:Enter Amazon URL
		driver.get("https:www.facebook.com/");
		Thread.sleep(2000); // Wait for 5 seconds

		// Smoke Testing: Verify URL of Amazon HomePage

		String ExceptedTittle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String ActuvalTittle = driver.getTitle();

		System.out.println("Excepted Tittle is: " + ExceptedTittle);
		System.out.println("Actual Tittle is: " + ActuvalTittle);

		if (ExceptedTittle.equals(ActuvalTittle)) // True
		{
			System.out.println("Smoke Testing is Passed, Tittle is matched");
		} 
		else 
		{
			System.out.println("Smoke Testing is Failed, Tittle not matched");

		}
		Thread.sleep(2000);
		driver.close(); // Close Browser
	}

}
