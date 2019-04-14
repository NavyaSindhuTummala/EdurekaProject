package day6.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting 
{
	
	WebDriver driver;
	
	public void invokeBrowser(String browserType) throws Exception
	{
		
		if(browserType.equalsIgnoreCase("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Harish/Desktop/Selenium/Softwares Download/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		
		} else if(browserType.equalsIgnoreCase("edge")) 
		  {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
			
		  } else if(browserType.equalsIgnoreCase("firefox")) 
		    {
			  System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		    } else 
		      {
			   throw new Exception("Invalid browser type");
		      }
		
		Dimension dim = new Dimension(500, 500);
		
		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://qatechhub.com");

	}


}