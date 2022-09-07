package openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser
{
	public static void main(String[] args)
	{
		//  System.setProperty("webdriver.gecho.driver","F:\\Workspace\\seleniumBasics\\executables\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\chromedriver.exe");
		
		FirefoxDriver fdriver = new FirefoxDriver();
		
		fdriver.get("https://www.flipcart.com");
		
		fdriver.close();
	}

}
