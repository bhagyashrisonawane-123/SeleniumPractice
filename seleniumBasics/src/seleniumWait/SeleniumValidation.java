package seleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumValidation {

	public static void main(String[] args)
	{
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver = new ChromeDriver();
		

		//define implicit wait for browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	    //to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
				
		//identify username field
		WebElement userName = driver.findElement(By.name("username"));
		
		System.out.println("UserName Input Field Visibility status is : " + userName.isDisplayed());
		System.out.println("UserName Input Field Editable status is : " + userName.isEnabled());
		
		String defaultValueInUserName = userName.getAttribute("placeholder");
		System.out.println("Default Text validation for user name input field : " + defaultValueInUserName.equals("Username"));
		
		//  Perform appropriate action the identified element
		userName.sendKeys("admin");
		
		//  Identify the required element from the UI
		WebElement passwdInputFd = driver.findElement(By.name("pwd"));
		
		System.out.println("PassWord Input field visibility status is : " + passwdInputFd.isDisplayed());
		System.out.println("Password Input field Editable status is : " + passwdInputFd.isEnabled());
	    
		String actualDefaultTextOnPassword = passwdInputFd.getAttribute("placeholder");
	    System.out.println("Default Text validation for password field : " + actualDefaultTextOnPassword.equals("Password"));
		
	    //  Perform appropriate action the identified element
		passwdInputFd.sendKeys("manager");
		
		//  identify the remeber check box  
		WebElement checkBox = driver.findElement(By.name("remember"));
		
		System.out.println("Keep me Logged in checkbox visibility status is : " + checkBox.isDisplayed());
		System.out.println("Keep me Logged in checkbox clickable status is : " + checkBox.isEnabled());
		
		System.out.println("Keep me Logged in default status is : " + checkBox.isSelected());
		checkBox.click();
		System.out.println("Keep me Logged in checkbox status is : " + checkBox.isSelected());
		
		//  Identify the required element from the UI
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		System.out.println("Login Button visibility status is : " + loginButton.isDisplayed());
		System.out.println("Login Button clickable status is : " + loginButton.isEnabled());
		
		String actualButton = loginButton.getText();
		System.out.println("Login Button name Validation : " + actualButton.equals("Login"));
		loginButton.click();
		
		driver.close();
		
		/*
		 * WebElement keepLoggedInLabelCheckBoxText = driver.findElement(By.id("keepLoggedInLabel"));
		 
		
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		
		String checkBoxTextName = keepLoggedInLabelCheckBoxText.getText();
		
		System.out.println(checkBoxTextName);
		*/
	}
}


/**
 * Username input field:
 * 			1. display
 * 			2. editable
 * 			3. default
 * Login button:
 * 			1. display
 * 			2. functional
 * 			3. button name
 * Keep me logged in check-box/radio button:
 * 			1. display
 * 			2. functional
 * 			3. selection
 * link:
 *			1. display
 * 			2. functional
 * 			3. link name
 * dropdown:
 * 			1. display
 * 			2. functional
 * 			3. default value
 * 			4. change value is reflecting or not
 * 			5. total option
 * 			6. multi select 
 * 
 * isDisplayed() --> To check visibility of any WebElement we can user this
 * 				true --> display/visible
 * 				false--> not displayed / not visible
 * isEnabled() ---> to check whether the WebElemenet is functional or not
 * 				true --> editable/functional
 * 				false --> non editable/non-functional
 * isSelected()---> to check whether radio button/check box is selected or not
 * 				true ---> selected
 * 				false---> not selected
 * getAttribute("attribute_name")--> use to get the attribute name which is passed in
 * 									 this method as parameter in form String
 * getText()--> give the inner text for the WebElement from HTML
 * 
 *	<p> inner text</p>
 *	<a...> inner text</a>
 *	<div..> inner text</div>
 */	
