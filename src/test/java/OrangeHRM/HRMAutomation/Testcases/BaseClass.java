package OrangeHRM.HRMAutomation.Testcases;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
//import OrangeHRM.HRMAutomation.Utilities.ReadConfig;

public class BaseClass{
	
	public String BrowserURL="https://opensource-demo.orangehrmlive.com/";
	public String uname="Admin";
	public String pword="admin123";
	
	//ReadConfig read=new ReadConfig();
	//public String BrowserURL=read.getBrowserURL();
	//public String uname=read.getUsername();
	//public String pword=read.getPassword();
	
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	@Parameters("browser")
	public void Setup(@Optional("chrome")String browser)
	{
		logger=Logger.getLogger("HRMAutomation");
		PropertyConfigurator.configure("log4j.properties");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		}
		
		
	}
	
	@AfterClass
	public void TearDown()
	{
	driver.quit();	
	}
	

}
