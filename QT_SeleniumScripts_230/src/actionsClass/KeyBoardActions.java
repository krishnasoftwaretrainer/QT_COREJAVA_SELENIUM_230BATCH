package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Actions action = new Actions(driver);
		
		WebElement TextArea1=driver.findElement(By.id("ta1"));
		//TextArea1.sendKeys("Welcome to Selenium");
		//TextArea1.sendKeys("WELCOME TO SELENIUM");
		WebElement TextArea2=driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea"));
		
		action.keyDown(TextArea1, Keys.SHIFT).
		sendKeys("welcome to selenium").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		
		//Select all the Text
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		//Copy the Text
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		//Paste the Text into Same TextArea
		//action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		//Clear the TextArea2
		//TextArea2.clear();
		action.keyDown(TextArea2, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		//action.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		
		//Paste the Text into Another TextArea2
		action.keyDown(TextArea2, Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
	
	
	
	}

}
