package day7;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Guru99Project 
{
	WebDriver driver;
	
	@Parameters("browserType")
	
	@BeforeClass
	
	public void invokeBrowser(String browserType) 
	{

		if(browserType.equalsIgnoreCase("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Harish/Desktop/Selenium/Softwares Download/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		
		} else if(browserType.equalsIgnoreCase("edge")) 
		  {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Harish/git/EdurekaProject/EdurekaProject/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
			
		  } else if(browserType.equalsIgnoreCase("firefox")) 
		    {
			  System.setProperty("webdriver.gecko.driver",
						"C:/Users/Harish/git/EdurekaProject/EdurekaProject/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		    }
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://demo.guru99.com/v4");
	}
	
	@Test(priority=0)
	
	public void verifyTitleOfThePage()
	{
		
		String titleOfThePage = driver.getTitle();
		
		System.out.println("Title :"+titleOfThePage);
		
	}
	
	
	@Parameters({"userid","userPass"})
	@Test (priority=1000)
	
	public void verifyLoginToGuru99(String userId, String userPassword)
	{
		// String userId = "mngr188555";
		
		// String userPassword = "Uhusaja";
		
        WebElement userIdElement;
		
		userIdElement = driver.findElement(By.name("uid"));
		
		userIdElement.sendKeys(userId);
		
		driver.findElement(By.name("password")).sendKeys(userPassword);
		
		driver.findElement(By.name("btnLogin")).click();
		
	}

	@AfterClass
	
	public void closeBrowser()
	{
		driver.quit();
	}
}

