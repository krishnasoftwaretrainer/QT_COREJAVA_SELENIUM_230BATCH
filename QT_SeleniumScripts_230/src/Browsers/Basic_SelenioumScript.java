package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic_SelenioumScript {

public static void main(String[] args) {
    //WebDriver driver = new ChromeDriver();
	WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://selenium.dev");

    driver.quit();
}
}