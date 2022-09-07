package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBookLogin
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + "F:\\Workspace\\seleniumBasics\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		
		if(actualTitle.equals(expectedTitle)) 
		{
			System.out.println("Login Page Opened Successfully....");
		} 
		else  {
			System.out.println("Login Page is not Opened Successfully....");
		}
		
		
		WebElement userFd = driver.findElement(By.id("email"));
		userFd.clear();
		userFd.sendKeys("pawan");
		
		WebElement pswFd = driver.findElement(By.name("pass"));
		pswFd.clear();
		pswFd.sendKeys("text@12345");
		
		WebElement loginFd = driver.findElement(By.id("loginbutton"));
		loginFd.click();
		
		//driver.close();
		
	}

}
