package Browser_Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser 
{

	public static void main(String[] args)
	{
		//Step1:Open Edge Browser
		//Step2:Maximize Browser
		//Step3:Enter FaceBook URL
		
		WebDriver driver=new EdgeDriver(); //Step1:Open Edge Browser
		driver.manage().window().maximize(); //Step2:Maximize Browser
		driver.get("https://www.facebook.com/"); //Step3:Enter FaceBook URL
		driver.close(); //Close Browser
	}
}
