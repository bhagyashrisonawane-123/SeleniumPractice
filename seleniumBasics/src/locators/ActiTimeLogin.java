package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeLogin {

	public static void main(String[] args) 
	{
		String drivePath = System.getProperty("user.dir") + ".\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", drivePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//verify login
		String lgPage = driver.getCurrentUrl();
		String expectedLgPg = "https://demo.actitime.com/login.do";
		System.out.println("verify login page: " + lgPage.equals(expectedLgPg));
		
		
		//  verify the Title
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Login";
		System.out.println("Validation of Title is: " + actualTitle.equals("actiTIME - Login"));
		
		if(actualTitle.equals(expectedTitle))  
		{
			System.out.println("Login page opened successfully....");
		}   
		else  {
			System.out.println("Login page is not opened successfully....");
		}
		// By Using User Name
		WebElement user = driver.findElement(By.id("username"));
		user.clear();
		user.sendKeys("admin");
		
		// By Using PassWord
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys("manager");
		
		//clickLogin
		WebElement signIn = driver.findElement(By.id("loginButton"));
		signIn.click();
		
		// driver.close();
	}

}
