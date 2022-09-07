package seleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String cred = driver.findElement(By.tagName("span")).getText();
		System.out.println(cred);
		
		/*cred = cred.replace(arg0, arg1);
		cred = cred.replace();
		cred = cred.replace();
		System.out.println(cred);
		
		String[] loginDetails = cred.split(" ");
		
		driver.findElement(By("")).sendKeys(loginDetails[0]);
		driver.findElement(By("")).sendKeys(loginDetails[1]);
		driver.findElement(By("")).click();
		*/
	}

}
