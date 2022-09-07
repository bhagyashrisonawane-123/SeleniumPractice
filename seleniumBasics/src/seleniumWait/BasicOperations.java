package seleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\seleniumBasics\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		//  Maximize Browser Window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//  Set Windows size based on our requirement
		driver.manage().window().setSize(new Dimension(500,600));
		Thread.sleep(2000);
		
	    //  Maximize Browser Window
	    driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//  Enter required application Url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//  Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    //   Get the Web Page Title
		System.out.println("Current Page Title is: " + driver.getTitle());
			
		//   Get the Curent Web Page Url
		System.out.println("Current Page Url is: " + driver.getCurrentUrl());
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//   Navigation In Browser
		Thread.sleep(2000);
		
		//   Go to Previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//   Next Page
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//   Reload or Refresh current page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Jump from Current Page To another page or Url
		driver.navigate().to("https://www.google.com/");
		
		driver.close();
		
	}

}
