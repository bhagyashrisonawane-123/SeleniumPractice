package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLogInOutHomePageValidation 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + "F:\\Workspace\\seleniumBasics\\executables\\chromedriver.exe";
		
		System.setProperty("webDriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Login";
		
		if (actualTitle.equals(expectedTitle))  
		{
			System.out.println("Login page is opened successfully....");
		}   else  {
			System.out.println("Login page is not opened successfully....");
		}
		
		//  Identitfy the required element from the UI & perform required action  //  0-30 seconds
		driver.findElement(By.id("username")).sendKeys("mathura");
		
		driver.findElement(By.name("pwd")).sendKeys("krishna@1234");
		
		driver.findElement(By.id("loginButton")).click();
		
		//WebElement logoutButton = driver.findElement(By.(""));
		
		//  Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedCondition.elementToBeClickeable());
		
		String actualHomePageTitle = driver.getTitle();
		System.out.println("Actual Home Page Title is: " + actualHomePageTitle);
		
		String expectedHomePageTitle = "actiTIME - Login";
		
		if(actualHomePageTitle.equals(expectedHomePageTitle))  { 
		System.out.println("Login is successfull Home Page Title is also verified....");
		}  else  {
			System.out.println("Either Login is Failed or Home Page title is changed");
		}
		
		//  driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By("")).click();
		
		//  close Browser
		//driver.close();
		
		
	}
}
		
		
	

	

