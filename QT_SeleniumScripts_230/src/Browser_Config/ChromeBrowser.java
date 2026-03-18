package Browser_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Step1:Open Chrome Browser
		//Step2:Maximize Browser
		//Step3:Enter FaceBook URL
		
		System.out.println("Step1:Open Chrome Browser");
		WebDriver driver=new ChromeDriver(); //Step1:Open Chrome Browser
		Thread.sleep(2000); //Wait for 2 seconds
		System.out.println("Step2:Maximize Browser");
		driver.manage().window().maximize(); //Step2:Maximize Browser
		Thread.sleep(2000);
		//driver.get("https://www.facebook.com/"); //Step3:Enter FaceBook URL
		System.out.println("Step3:Enter Amazon URL");
		driver.get("https://www.amazon.in/"); //Step3:Enter Amazon URL
		Thread.sleep(5000); //Wait for 5 seconds
		System.out.println("Step4:Close Browser");
		driver.close(); //Close Browser

	}

}
