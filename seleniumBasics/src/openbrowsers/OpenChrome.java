package openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{
	public static void main(String[] args)
	{
		String currentWorkingDir = System.getProperty("user.dir");
		
		System.out.println("Current Working Directory : " + currentWorkingDir);
		
		String chromeExePath = currentWorkingDir + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.google.com");
		
		// Close the Current Browser
		cdriver.close();
	}

}
