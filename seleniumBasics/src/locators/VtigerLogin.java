package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Using System class
		String driverPath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
				
		// Set the driver executable path using Systeem.setProperty(String Key,String Value)
		System.setProperty("webdriver.chrome.driver", driverPath);
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		// Identify User Name field
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		//  Identify Password Field
		WebElement pwdname = driver.findElement(By.name("password"));
		pwdname.clear();
		pwdname.sendKeys("Test@123");
		
		//  Identify Sign In Button
		WebElement signInButton = driver.findElement(By.className("buttonBlue"));
		/* Perform require operation in the Sign in Button */
		signInButton.click();
		
		// driver.close();
	}

}
