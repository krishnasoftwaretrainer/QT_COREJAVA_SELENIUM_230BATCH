package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/webtables");
		// CRUD Operations on WebTables
		WebElement AddButton = driver.findElement(By.id("addNewRecordButton"));
		AddButton.click();
		Thread.sleep(2000);
		// FirstName
		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Krishna");
		Thread.sleep(2000);
		// LastName
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("Rao");
		Thread.sleep(2000);
		// Email
		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("Krishna@gmail.com");
		Thread.sleep(2000);
		// Age
		WebElement Age = driver.findElement(By.id("age"));
		Age.sendKeys("25");
		Thread.sleep(2000);
		// Salary
		WebElement Salary = driver.findElement(By.id("salary"));
		Salary.sendKeys("56894");
		Thread.sleep(2000);
		// Department
		WebElement Department = driver.findElement(By.id("department"));
		Department.sendKeys("Testing");
		Thread.sleep(2000);
		// Submit
		WebElement Submit = driver.findElement(By.id("submit"));
		Submit.click();
		Thread.sleep(2000);

		// Search
		WebElement Search = driver.findElement(By.id("searchBox"));
		Search.sendKeys("Krishna");
		Thread.sleep(2000);

		// Search
		WebElement Edit = driver.findElement(By.id("edit-record-4"));
		Edit.click();
		Thread.sleep(2000);

		// Update Salary
		WebElement Salary_update = driver.findElement(By.id("salary"));
		Salary_update.clear();
		Salary_update.sendKeys("60000");
		Thread.sleep(2000);
		// Submit
		WebElement Submit_Update = driver.findElement(By.id("submit"));
		Submit_Update.click();
		Thread.sleep(2000);

		// Delete
		WebElement Delete = driver.findElement(By.id("delete-record-4"));
		Delete.click();
		Thread.sleep(2000);
		
		//Refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();

	}

}
