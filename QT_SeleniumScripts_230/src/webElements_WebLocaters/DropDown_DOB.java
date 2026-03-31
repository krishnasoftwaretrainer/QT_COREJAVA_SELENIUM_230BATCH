package webElements_WebLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_DOB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		// Top to Bottom[Down]-> Vertical Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("yearbox"));
		//year.click();
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		WebElement day = driver.findElement(By.id("daybox"));
		
		Select select1 = new Select(year);
		select1.selectByIndex(5);
		Thread.sleep(2000);
		Select select2 = new Select(month);
		select2.selectByValue("November");
		Thread.sleep(2000);
		Select select3 = new Select(day);
		select3.selectByVisibleText("15");
		//day.sendKeys("15");
	}

}
