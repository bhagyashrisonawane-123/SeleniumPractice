package openbrowsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class OpenYatra 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.yatra.com/");
		
	
	}

}
