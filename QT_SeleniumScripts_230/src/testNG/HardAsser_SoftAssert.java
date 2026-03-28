package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAsser_SoftAssert 
{
	
	@Test
	public void HardSoft_Assert() throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//Test case=1
	driver.get("https://www.amazon.in/");
	//driver.get("https://www.saucedemo.com/");
	String expectedURL = "https://www.amazon.in/";
	String actualURL = driver.getCurrentUrl();
	
	SoftAssert softAssert = new SoftAssert();
	//Assert.assertEquals(actualURL, expectedURL, "URL is not matching, Test Failed");
	softAssert.assertEquals(actualURL, expectedURL, "URL is not matching, Test Failed");
	Thread.sleep(2000);
	
	//Test case=2
	//New Tab
	
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get("https://www.saucedemo.com/");
	
	String expectedURL1 = "https://www.saucedemo.com/";
	String actualURL1 = driver.getCurrentUrl();
	
	//Assert.assertEquals(actualURL1, expectedURL1, "URL is not matching, Login Failed");
	softAssert.assertEquals(actualURL1, expectedURL1);
	Thread.sleep(2000);
	
	//Test case=3
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get("https://www.facebook.com/");
	String expectedURL2 = "https://www.facebook.comghcfh/";
	String actualURL2 = driver.getCurrentUrl();
	
	//Assert.assertEquals(actualURL2, expectedURL2, "URL is not matching, Login Failed");
	softAssert.assertEquals(actualURL2, expectedURL2);
	Thread.sleep(2000);
	
	//Test case=4
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.instagram.com/");
	String expectedURL3 = "https://www.instagram.com/";
	String actualURL3 = driver.getCurrentUrl();
	
	softAssert.assertEquals(actualURL3, expectedURL3, "URL is not matching, Login Failed");
	
	//Test case=5
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.youtube.com/");
	String expectedURL4 = "https://www.youtube.com/";
	String actualURL4 = driver.getCurrentUrl();
	softAssert.assertEquals(actualURL4, expectedURL4, "URL is not matching, Login Failed");
	Thread.sleep(2000);
	softAssert.assertAll();
	}

}
