package OrangeHRM.HRMAutomation.Testcases;

import org.testng.annotations.Test;

import OrangeHRM.HRMAutomation.PageObjects.LoginPageWebElements;

//import OrangeHRM.HRMAutomation.PageObjects.LoginPageWebElements;

public class TC1_OrangeHRM_LoginPage extends BaseClass{
	
	@Test
	public void LoginPageImplementation() throws InterruptedException
	{
		logger.info("URL is opened");
		driver.get(BrowserURL);
		
		Thread.sleep(5000);
		LoginPageWebElements lp=new LoginPageWebElements(driver);
		lp.SetUsername(uname);
		logger.info("Entered Username");
		
		lp.SetPassword(pword);
		logger.info("Entered Password");
		
		lp.ClickLoginButton();
		logger.info("Login button pressed");
		
		//SoftAssert softAssert = new SoftAssert();
		String Expected_Title="OrangeHRM";
		String Actual_Title=driver.getTitle();
		
		if(Actual_Title.equals(Expected_Title))
		{
			logger.info("TC1 passed");
			System.out.println("Testcase passed");
		}
		
		else
		{
			logger.info("TC1 failed");
			System.out.println("Testcase failed");
		}
		
	}
	

}
