package webElements_WebLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_TextArea 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		//1.TextBox1:First Name
		/*
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Krishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Rao");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Ramesh");
		*/
		WebElement FristName=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		FristName.sendKeys("Ramesh");
		Thread.sleep(2000);
		WebElement LastName=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		LastName.clear();
		LastName.sendKeys("Babu");
		Thread.sleep(2000);
		WebElement Address=driver.findElement(By.tagName("textarea"));
		Address.sendKeys("Quality Thoughts, \nAmmerpet, \nHyderabad, \n500019");
		
		//Get Attribute 
		String value=FristName.getAttribute("value");
		String value1=LastName.getAttribute("value");
		String value2=Address.getAttribute("value");

		System.out.println("FristName is: "+value);
		System.out.println("LastName is: "+value1);
		System.out.println("Address is: "+value2);
		
		String FirstName_placeholder=FristName.getAttribute("placeholder");
		String LastName_placeholder=LastName.getAttribute("placeholder");
		String Address_placeholder=Address.getAttribute("placeholder");
		System.out.println("FristName_placeholder is: "+FirstName_placeholder);
		System.out.println("LastName_placeholder is: "+LastName_placeholder);
		System.out.println("Address_placeholder is: "+Address_placeholder);
		
		/*
		FristName.sendKeys("Krishna");
	    Thread.sleep(2000);
	    FristName.sendKeys(" Rao");
	   // Thread.sleep(2000);
	    //FristName.clear(); //To clear the text box data
	    Thread.sleep(2000);
	    */
	    	}

}
