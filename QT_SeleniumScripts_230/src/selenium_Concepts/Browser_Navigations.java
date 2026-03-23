package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Navigations {

	public static void main(String[] args) throws InterruptedException {
		// navigate backward forward refresh or reload 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		//Amazon
		Thread.sleep(2000);
		driver.navigate().back();
		//FaceBook
		Thread.sleep(2000);
		driver.navigate().forward();
		//Amazon
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Done!..");
		
	}

}
