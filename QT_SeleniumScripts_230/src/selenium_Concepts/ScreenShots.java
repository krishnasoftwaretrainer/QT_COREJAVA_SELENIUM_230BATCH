package selenium_Concepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShots {
	public static void main(String[] args) throws InterruptedException, IOException {
		// navigate backward forward refresh or reload
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		// Screen Shot-1
		File sc1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc1, new File("D:\\QT\\QT_Selenium_230Batch\\ScreenShots\\SC1_FB.png"));

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		// Screen Shot-1
		File sc2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc2, new File("D:\\QT\\QT_Selenium_230Batch\\ScreenShots\\SC2_Amazon.png"));

		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		// Screen Shot-1
		File sc3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc3, new File("D:\\QT\\QT_Selenium_230Batch\\ScreenShots\\SC3_SwagLabs.png"));

		driver.navigate().back();
		// Amazon
		Thread.sleep(2000);
		// Screen Shot-1
		File sc4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc4, new File("D:\\QT\\QT_Selenium_230Batch\\ScreenShots\\SC4_Back_Amzon.png"));

		driver.navigate().back();
		// FaceBook
		Thread.sleep(2000);
		// Screen Shot-1
		File sc5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc5, new File("D:\\QT\\QT_Selenium_230Batch\\ScreenShots\\SC5_Back_FB.png"));

		driver.navigate().forward();
		// Amazon
		Thread.sleep(2000);
		// Screen Shot-1
		File sc6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc6, new File("D:\\QT\\QT_Selenium_230Batch\\ScreenShots\\SC6_Forward_Amzon.png"));
		driver.navigate().refresh();
		// Screen Shot-1
		File sc7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc7, new File("D:\\QT\\QT_Selenium_230Batch\\ScreenShots\\SC7_Refresh_Amzon.png"));

		System.out.println("Done!..");

	}

}
