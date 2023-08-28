package OrangeHRM.HRMAutomation.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro=new Properties();
	
	//Constructor
	public ReadConfig() throws IOException
	{
		File src=new File("./Configurations/Config.properties");
		FileInputStream  fis=new FileInputStream(src);
		pro.load(fis);
		
	}
	
	public String getBrowserURL()
	{
		String url=pro.getProperty("BrowserURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("uname");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("pword");
		return password;
	}
	public String getChromeDriver()
	{
		String chromepath=pro.getProperty("ChromeDriverPath");
		return chromepath;
	}
	public String getFirefoxDriver()
	{
		String firefoxpath=pro.getProperty("FirefoxDriverPath");
		return firefoxpath;
	}
	
	
	

}
