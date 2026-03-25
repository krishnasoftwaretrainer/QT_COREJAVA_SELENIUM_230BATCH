package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		//Dram Me 
		WebElement DragMe=driver.findElement(By.id("draggable"));
		//Drop Here
		WebElement DropHere=driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		//action.dragAndDropBy(DragMe, 0, 100).build().perform();//Up to Down
		action.dragAndDrop(DragMe, DropHere).build().perform();
	}

}
