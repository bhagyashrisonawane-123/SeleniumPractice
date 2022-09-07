package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Agoda 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.agoda.com/");

		WebElement username = driver.findElement(By.cssSelector("#email"));
		username.clear();
		username.sendKeys("mona@12345");
		
		WebElement pswfiled = driver.findElement(By.cssSelector("#password"));
		pswfiled.clear();
		pswfiled.sendKeys("bhusawal");
		
	    driver.findElement(By.name("universal-login-signin-email-button")).click();
		
	}

}
