package openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;



public class OpenGoogle2 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.google.com/");
		
	}

}