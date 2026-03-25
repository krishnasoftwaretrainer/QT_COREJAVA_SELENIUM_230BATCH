package selenium_Concepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//System.out.println("Tab1: " + driver.getWindowHandle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		//System.out.println("Tab2: " + driver.getWindowHandle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		//System.out.println("Tab3: " + driver.getWindowHandle());
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		//System.out.println("Window1: " + driver.getWindowHandle());
		
		Set<String> AllWidowHandles=driver.getWindowHandles();
		System.out.println("All Window Handles: " + AllWidowHandles);
		System.out.println("Count of Windows: " + AllWidowHandles.size());
		Thread.sleep(1000);
		
		//driver.close();
		driver.quit();
	}

}
