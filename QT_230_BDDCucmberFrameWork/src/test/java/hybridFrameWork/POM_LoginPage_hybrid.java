package hybridFrameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginPage_hybrid 
{
	
	public POM_LoginPage_hybrid()
	{
		PageFactory.initElements(Hooks_hybrid.driver, this);
	}
	
	@FindBy(id="user-name")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginBtn;
	
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	

}
