package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile_SawgLogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fileInputStream = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\2026-03\\QT_SeleniumScripts_230\\src\\properties\\SwagTestData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);

		driver.get(prop.getProperty("swagurl"));
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id(prop.getProperty("swaglocator_username")));
		username.sendKeys(prop.getProperty("swagusername"));
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id(prop.getProperty("swaglocator_password")));
		password.sendKeys(prop.getProperty("swagpassword"));
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id(prop.getProperty("swaglocator_loginbutton")));
		login.click();
	}

}
