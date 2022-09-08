package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		if(actualTitle.equals(expectedTitle)) 
		  {
			System.out.println("Login Page is Opened Successfully....");
		  }  
		else  {
			System.out.println("Login Page is not Opened Successfully....");
		      }
		
		
		WebElement userInputField = driver.findElement(By.id("txtUsername"));
		userInputField.clear();
		userInputField.sendKeys("suchitra");
		
		WebElement pwdInputField = driver.findElement(By.cssSelector("input[id='txtPassword']"));
		pwdInputField.clear();
		pwdInputField.sendKeys("saii@1234");
		
		WebElement loginButton = driver.findElement(By.cssSelector("input[id='btnLogin']"));
		loginButton.click();
		
		driver.close();
	}
}

	