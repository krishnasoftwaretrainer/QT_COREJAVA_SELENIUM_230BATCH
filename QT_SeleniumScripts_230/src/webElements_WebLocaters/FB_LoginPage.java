package webElements_WebLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_LoginPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	//driver.findElement(By.id("_R_64qjbjb9pb6amH1_")).sendKeys("Krishna@gmail.com");
	driver.findElement(By.tagName("input")).sendKeys("Krishna@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys("124234");
	Thread.sleep(2000);
	//driver.findElement(By.className("x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x2lah0s x193iq5w x6s0dn4 xz9dl7a x1k70j0n xzueoph xzboxd6 x14l7nz5")).click();
	//Compound class names not permitted
	
	//driver.findElement(By.linkText("Log i")).click();
	driver.findElement(By.partialLinkText("Log i")).click();
	
	
		
/*
* TC2:Valid Email and InValid Password
--------------
1.Open Chrome Browser and Maximize
2.Enter Valid URL[Smoke Testing]
3.Enter Valid EmailID
4.Enter InValid Password
5.Click on LoginButton
WebElements:TextBox and Button
Web Locaters:ID,Name,ClassName,LinkText,PartialLinkText

		 */
	}

}
