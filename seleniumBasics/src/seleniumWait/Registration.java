package seleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement userInField = driver.findElement(By.(""));
		userInField.sendKeys("admin");
		//  By using Url
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demo.automationtesting.in/Register.html";
		System.out.println("Url validation status : " + actualUrl.equals(expectedUrl));
		
		//  By using Title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Register";
		System.out.println("Page Title : " + actualTitle);
		System.out.println("Actual Length : " + actualTitle.length());
		System.out.println("Title Validation : " + actualTitle.equals(expectedTitle));
		
		//  By Using Page Source
		String pageContent = driver.getPageSource();
		System.out.println("Page Source Length : " + pageContent.length());
		
	}
}
