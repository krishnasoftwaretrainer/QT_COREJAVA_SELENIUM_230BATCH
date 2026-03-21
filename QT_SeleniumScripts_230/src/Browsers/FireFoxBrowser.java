package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser 
{

	public static void main(String[] args)
	{
		//Step1:Open FireFoxBrowser
		//Step2:Maximize Browser
		//Step3:Enter FaceBook URL
		
		WebDriver driver=new FirefoxDriver(); //Step1:Open FireFoxBrowser
		driver.manage().window().maximize(); //Step2:Maximize Browser
		driver.get("https://www.facebook.com/"); //Step3:Enter FaceBook URL

	}
}
