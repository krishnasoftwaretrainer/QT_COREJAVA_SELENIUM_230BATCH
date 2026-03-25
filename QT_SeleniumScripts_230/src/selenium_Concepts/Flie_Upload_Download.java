package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flie_Upload_Download {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		//File Upload
		WebElement ChooseFile=driver.findElement(By.id("input-4"));
		ChooseFile.sendKeys("C:\\Users\\HP\\Downloads\\codekru.png");
		Thread.sleep(2000);
		ChooseFile.sendKeys("C:\\Users\\HP\\Downloads\\codekru.png");
		*/
		driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		WebElement DownloadButton=driver.findElement(By.partialLinkText("Download"));
		DownloadButton.click();
		Thread.sleep(2000);
		WebElement EnterText=driver.findElement(By.id("textbox"));
		EnterText.sendKeys("Selenium File Download \n Selenium File Download \n Selenium File Download \n Selenium File Download");
		Thread.sleep(2000);
		WebElement GenerateFile=driver.findElement(By.id("createTxt"));
		GenerateFile.click();
		Thread.sleep(2000);
		WebElement DownloadTextFile=driver.findElement(By.id("link-to-download"));
		DownloadTextFile.click();
	}

}
