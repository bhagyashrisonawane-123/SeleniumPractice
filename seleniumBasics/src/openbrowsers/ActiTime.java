package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + "F:\\Workspace\\seleniumBasics\\executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.actitime.com/");
		
		String pageTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Time Tracking Software for Smart Teams";
		
		if(pageTitle.equals(expectedTitle))
		{
			System.out.println("Login Page Open Successfully.....");
		}
		
		else
		{
			System.out.println("Login Page is not Open Successfully.....");
		}
	}

}
