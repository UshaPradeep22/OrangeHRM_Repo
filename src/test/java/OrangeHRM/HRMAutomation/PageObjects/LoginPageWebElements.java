package OrangeHRM.HRMAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWebElements {
	WebDriver ldriver;

	public LoginPageWebElements(WebDriver rDriver)
	{
		this.ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}
	@CacheLookup
	@FindBy (name="username")
	WebElement UsernameTxtbox;
	
	@CacheLookup
	@FindBy (name="password")
	WebElement PasswordTxtbox;	
	
	@CacheLookup
	@FindBy (tagName="button")
	WebElement LoginButton;	
	
	public void SetUsername(String username1)
	{
		UsernameTxtbox.sendKeys(username1);
	}
	public void SetPassword(String password1)
	{
		PasswordTxtbox.sendKeys(password1);
	}
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
	
}