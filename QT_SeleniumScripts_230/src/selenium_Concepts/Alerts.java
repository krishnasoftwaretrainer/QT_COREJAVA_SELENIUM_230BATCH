package selenium_Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		WebElement AlertBox = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		AlertBox.click();
		Thread.sleep(1000);
		String Alert1Text=driver.switchTo().alert().getText();
		System.out.println("Alert Box Text: " + Alert1Text);
		driver.switchTo().alert().accept();
         Thread.sleep(1000);
         WebElement AlertwithOK_Cancel=driver.findElement(By.partialLinkText("Alert with OK & Cancel"));
         AlertwithOK_Cancel.click();
         Thread.sleep(1000);
         WebElement ConfirmBox=driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
         ConfirmBox.click();
         Thread.sleep(1000);
         String Alert2Text=driver.switchTo().alert().getText();
         System.out.println("Confirm Box Text: " + Alert2Text);
        // driver.switchTo().alert().accept();
         driver.switchTo().alert().dismiss();
         Thread.sleep(1000);
         WebElement AfterAlertText=driver.findElement(By.id("demo"));
         String AfterAlertTextMessage=AfterAlertText.getText();
         System.out.println("After Alert Text: " + AfterAlertTextMessage);
         Thread.sleep(1000);
         
         WebElement AlertwithTextBox=driver.findElement(By.partialLinkText("Alert with Textbox"));
         AlertwithTextBox.click();
         Thread.sleep(1000);
         WebElement PromptBox=driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
         PromptBox.click();
         Thread.sleep(1000);
         String Alert3Text=driver.switchTo().alert().getText();
         System.out.println("Prompt Box Text: " + Alert3Text);
         driver.switchTo().alert().sendKeys("Krishna");
         Thread.sleep(1000);
         driver.switchTo().alert().accept();
         WebElement AfterPromptText=driver.findElement(By.id("demo1"));
         String AfterPromptTextMessage=AfterPromptText.getText();
         System.out.println("After Prompt Box Text: " + AfterPromptTextMessage);
         Thread.sleep(1000);
         driver.quit();
         
	}

}
