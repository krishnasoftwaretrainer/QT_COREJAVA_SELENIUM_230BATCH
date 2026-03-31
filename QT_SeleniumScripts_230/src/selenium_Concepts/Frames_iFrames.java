package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_iFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		//Switching to Frame
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		WebElement TextBox = driver.findElement(By.xpath("//input[@type='text']"));
		TextBox.sendKeys("Selenium");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement iFramewitnFrame=driver.findElement(By.partialLinkText("Iframe with in an Iframe"));
		iFramewitnFrame.click();
		Thread.sleep(2000);
		//Switching to Outer Frame
		WebElement OuterFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(OuterFrame);		
		//Switching to Inner Frame
		WebElement InnerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(InnerFrame);
		Thread.sleep(2000);
		//Enter Text in Text Box
		WebElement TextBox2 = driver.findElement(By.xpath("//input[@type='text']"));
		TextBox2.sendKeys("iFrame with in an iFrame");
	}

}
