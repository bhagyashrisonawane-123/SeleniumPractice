package openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxGoogle
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		
		FirefoxDriver fdriver = new FirefoxDriver();
		
		fdriver.get("https://www.google.com/");
		
	}

}
