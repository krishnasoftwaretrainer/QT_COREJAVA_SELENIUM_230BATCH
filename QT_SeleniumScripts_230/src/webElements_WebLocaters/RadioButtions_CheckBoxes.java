package webElements_WebLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtions_CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//1.Radio Button:Male
		WebElement Male=driver.findElement(By.name("radiooptions"));
		Male.click();
		Thread.sleep(2000);
		//2.Radio Button:Female
		WebElement Female=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		Female.click();
		Thread.sleep(2000);
		Female.click();
		Thread.sleep(2000);
		//Check Box:Cricket
		WebElement Cricket=driver.findElement(By.id("checkbox1"));
		Cricket.click();
		Thread.sleep(2000);
		//Check Box:Movies
		WebElement Movies=driver.findElement(By.id("checkbox2"));
		Movies.click();
		Thread.sleep(2000);
		//Check Box:Hockey
		WebElement Hockey=driver.findElement(By.id("checkbox3"));
		Hockey.click();
		Thread.sleep(2000);
		
		Cricket.click();
		Thread.sleep(2000);
		Movies.click();
		Thread.sleep(2000);
		Hockey.click();
	}

}
