package actionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Double_Right_Click
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		//Double Click and get the message
		WebElement DoubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(DoubleClickBtn).build().perform();
		WebElement DoubleClickMsg=driver.findElement(By.id("doubleClickMessage"));
		System.out.println(DoubleClickMsg.getText());
		
		//Right Click and get the message
		WebElement RightClickBtn=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(RightClickBtn).build().perform();
		WebElement RightClickMsg=driver.findElement(By.id("rightClickMessage"));
		System.out.println(RightClickMsg.getText());
	}
	

}
