package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenAnyBrowser 
{
	public static void main(String[] args)
	{
		String geckoDriverPath = System.getProperty("user.dir") + ".\\executables\\geckodriver.exe";
		
		String chromeDriverPath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		openBrowser(geckoDriverPath, "firefox");
		openBrowser(chromeDriverPath, "chrome");
	}
		
		
		static void openBrowser(String geckoDriverPath, String firefox)
		{
			if(firefox.equalsIgnoreCase("Chrome"))  
			{
				System.setProperty("webdriver.chrome.driver", geckoDriverPath);	
				
				WebDriver driver = new ChromeDriver();
			}  else   {
                System.setProperty("webdriver.gecko.driver", geckoDriverPath);	
				
				WebDriver driver = new FirefoxDriver();

			}
			
		}
		
		
	}

