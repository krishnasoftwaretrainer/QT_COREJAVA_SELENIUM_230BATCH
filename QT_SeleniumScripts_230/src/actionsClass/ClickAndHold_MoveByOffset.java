package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ClickAndHold_MoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement DragMe=driver.findElement(By.id("dragBox"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		//Move by Offset Right
		action.clickAndHold(DragMe).moveByOffset(0, 50).build().perform();//Up to Down
		Thread.sleep(2000);
		action.clickAndHold(DragMe).moveByOffset(0, -50).build().perform();//Down to Up
		Thread.sleep(2000);
		action.clickAndHold(DragMe).moveByOffset(50, 0).build().perform();//Left to Right
		Thread.sleep(2000);
		action.clickAndHold(DragMe).moveByOffset(-50, 0).build().perform();//Right to Left
		
	}

}
