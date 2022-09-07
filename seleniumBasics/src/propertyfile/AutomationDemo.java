package propertyfile;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemo 
{
	public static void main(String[] args)
	{

		String driverPath1 = System.getProperty("user.dir");
		
		String chromeExePath = driverPath1 + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		for(int i = 0; i < options.size(); i++)
		{
			skillName = skillName + options.get(i).getText() + ", ";
		}
		
		//  Expected Skills
		String exp_skillNames = "";
		System.out.println("skillName: " + skillName);
		System.out.println("exp_skillNames: " + exp_skillNames);
		System.out.println("skill are in sorted order or not: " + skillName.equals(exp_skillNames));
		
		Select dayDrop = new Select(driver.findElement(By(""));
		
		List<Integer> days = new ArrayList<Integer>();
		
		for(int i = 0; i < dayDrop.getAllSelectedOptions().size(); i++)
		{
			String day = dayDrop.getOptions().get(i).getText();
			
			days.add(Integer.parseInt(day));
		}
		
		List<Integer> dupdays = new ArrayList<Integer>(days);
		
		Collections.sort(dupdays);
		
		System.out.println(days.equals(dupDays));
		
	}

}
