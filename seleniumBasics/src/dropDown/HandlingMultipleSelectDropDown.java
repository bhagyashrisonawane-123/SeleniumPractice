package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelectDropDown 
{

	public static void main(String[] args)
	{
        String path = System.getProperty("user.dir") + "F:\\Workspace\\seleniumBasics\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		//   Identify dropdown List
		WebElement carDropDown = driver.findElement(By.id("multiselect1"));
		
		// ====== Create an Instance of Select class & pass above Element into its Constructor
		Select selectSkill = new Select(carDropDown);
		
		//   ******Check Wheather dropdown is multiselect dropdown or not
		System.out.println("Is DropDown is allowing you to select multiple option: " + selectSkill.isMultiple());
		
		//   =====Get default or already select option
		//  ** WebElemnt selectedOptionName = selectedOption.getText();
		//System.out.println("Already selected option Name: " + selectSkill.getFirstSelectedOption().getText());
		
	    //   Get Option Count
			List<WebElement> option = selectSkill.getOptions();
			
			System.out.println("Option count is: " + option.size());
			
			//   Get DropDown Option Names
			for(int i = 0; i < option.size(); i++)
			{
				System.out.println("Option " + i + ": " + option.get(i).getText());
			}
			
			//   Select Options from dropdown
			selectSkill.selectByIndex(0);
		
			selectSkill.selectByValue("Hyundaix");

			selectSkill.selectByVisibleText("Audi");
			
			//  Get All the selected Options
			List<WebElement> selectCars = selectSkill.getAllSelectedOptions();
			
			System.out.println("Slected car count: " + selectCars.size());
			
			//   Unselect already select options
			selectSkill.deselectByIndex(0);
			selectSkill.deselectByValue("Hyundaix");
			selectSkill.deselectByVisibleText("Audi");
			
			//   selectSkill.deselectAll();			
			

		
	}

}
