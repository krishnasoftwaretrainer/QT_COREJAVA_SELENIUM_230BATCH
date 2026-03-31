package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		WebElement Cricket=driver.findElement(By.id("checkbox1"));
		Cricket.click();
		Thread.sleep(2000);
		
		List<WebElement> ChekBoxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		System.out.println("Total Check Boxes are: "+ChekBoxes.size()); //3
		
		
		for(int i=0;i<ChekBoxes.size();i++)  //0<3,1<3,2<3,true 3<3,false
		{
			if(!ChekBoxes.get(i).isSelected() && ChekBoxes.get(i).isDisplayed() && ChekBoxes.get(i).isEnabled())
			{
			ChekBoxes.get(i).click();
			System.out.println("Check Box "+(i+1)+" is clicked");
		}
		}	
	driver.quit();
	}

}
