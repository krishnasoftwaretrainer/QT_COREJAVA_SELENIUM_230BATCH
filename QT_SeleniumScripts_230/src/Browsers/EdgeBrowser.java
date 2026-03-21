package Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowser 
{

	public static void main(String[] args)
	{
		//Step1:Open Edge Browser
		//Step2:Maximize Browser
		//Step3:Enter FaceBook URL
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless"); // Enable headless mode
		WebDriver driver=new EdgeDriver(options); //Step1:Open Edge Browser
		driver.manage().window().maximize(); //Step2:Maximize Browser
		driver.get("https://www.facebook.com/"); //Step3:Enter FaceBook URL
		driver.close(); //Close Browser
	}
}
