package selenium_Concepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_WebPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//Top to Bottom[Down]-> Vertical Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		//Bottom to Top[Up]-> Vertical Scrolling
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		//Left to Right-> Horizontal Scrolling
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(500,0)");
		//Right to Left-> Horizontal Scrolling
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0)");
		
		
	}

}
