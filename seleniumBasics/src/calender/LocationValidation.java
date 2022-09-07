package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationValidation {

	public static void main(String[] args) 
	{
		String driverPath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userName = driver.findElement(By.id("username"));
		Point userNameLocation = userName.getLocation();
		int userName_X = userNameLocation.getX();
		int userName_Y = userNameLocation.getY();
		System.out.println("UserName x cord: " + userName_X);
		System.out.println("UserName y cord: " + userName_Y);
		
		
		WebElement password = driver.findElement(By.id("password"));
		Point passwordLocation = password.getLocation();
		int pwd_X = userNameLocation.getX();
		int pwd_Y = userNameLocation.getY();
		System.out.println("PassWord x cord: " + pwd_X);
		System.out.println("passWord y cord: " + pwd_Y);
		
		System.out.println("Check Wheather Password Field comes after Username field -->" + (userName_Y<pwd_Y));
		
		
		WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
		
		Point signInButtonLocation = signInButton.getLocation();
		int btn_X = signInButtonLocation.getX();
		int btn_Y = userNameLocation.getY();
		System.out.println("Sign In Button x cord: " + btn_X);
		System.out.println("Sign In Button y cord: " + btn_Y);
		
        System.out.println("Check wheather Sign In Button comes after password field -->" + (pwd_Y<btn_Y));
		
        //    Note : Below is wrong, please make corrections in this program
        //     yaha  "True" aana chyahiye but console mein false dikha rha hai.
		

	}

}
