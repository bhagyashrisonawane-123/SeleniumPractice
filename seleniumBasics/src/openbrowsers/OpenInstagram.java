package openbrowsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class OpenInstagram 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\seleniumBasics\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.close();
	}

}
