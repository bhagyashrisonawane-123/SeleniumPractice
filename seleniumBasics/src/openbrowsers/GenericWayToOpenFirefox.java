package openbrowsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefox
{
	public static void main(String[] args)
	{
		String currentWorkingDiv = System.getProperty("user.dir");
		
		String geckoExePath = currentWorkingDiv + ".\\executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",geckoExePath);
		
	    WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.close();
	}

}
