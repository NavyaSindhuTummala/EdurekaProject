package assignment5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class EdurekaPortalTestNg 
{
WebDriver driver;
	
	@BeforeClass
	

	public void invokeBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Harish/Desktop/Selenium/Softwares Download/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.edureka.co");
	}
	
@Test(priority=0)
	
	public void verifyTitleOfThePage()
	{
		
		String titleOfThePage = driver.getTitle();
		
		System.out.println("Title :"+titleOfThePage);
		
	}
	
@Parameters({"userid","userPass"})
@Test (priority=1000)

public void verifyLoginToEdureka()
{
	 String userId = "navyasindhutummala@gmail.com";
	
     String userPassword = "Tns@1206";
	
		driver.findElement(By.linkText("Log In")).click();
		
    /*    WebElement userIdElement;
		
		userIdElement = driver.findElement(By.xpath("//input[@id='si_popup_email']"));
		
		userIdElement.sendKeys(userId); */
		
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys(userId);
		
   /*     WebElement userPassElement;
		
		userPassElement = driver.findElement(By.xpath("//input[@id='si_popup_passwd']"));
		
		userPassElement.sendKeys(userPassword);  */
		
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys(userPassword);
		
		driver.findElement(By.xpath("//button[text()= 'Login']")).click();
			
	} 
	
@Test (priority=2000)
	public void browseCourses() throws InterruptedException
	{
		
		Actions action = new Actions(driver);
       
        driver.findElement(By.xpath("//a[@data-button-name='Courses Dropdown']")).click();
        
        WebElement allCoursesLink = driver.findElement(By.xpath("//li[@class='ga-allcourses ga_ecom_info']"));
		
        waitTillElementVisibleWithFluentWait(10, By.xpath("//li[@class='ga-allcourses ga_ecom_info']"), 0);		
		
        action.moveToElement(allCoursesLink).click().build().perform();  
		
		
	} 
	
@Test (priority=3000)
	public void logout()
	{
		driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']/span[@class ='webinar-profile-name']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@data-button-name='Logout']")).click();
	}
	
	private void waitTillElementVisibleWithFluentWait(int timeOutInSeconds, By locator, int pollingTime) 
	{

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	@Parameters({"userid","userPhNo"})
	@Test (priority =5000)
	public void registerUser()
	{
		String userId = "navyasindhutummala@gmail.com";
		
	     String phoneNo = "9652851400";
		
		driver.findElement(By.xpath("//div[@class='menubar-visibility clp-head-flow']/a[@data-button-name='Signup']")).click();
		
		driver.findElement(By.xpath("//input[@id='sg_popup_email']")).sendKeys(userId);

     /*   WebElement userIdElement;
		
		userIdElement = driver.findElement(By.xpath("//input[@id='sg_popup_email']"));
		
		userIdElement.sendKeys(userId);  */
		
		driver.findElement(By.xpath("//input[@id='sg_popup_phone_no']")).sendKeys(phoneNo);
		
    /*   WebElement phoneNoElement;
		
        phoneNoElement = driver.findElement(By.xpath("//input[@id='sg_popup_phone_no']"));
		
        phoneNoElement.sendKeys(phoneNo);  */
        
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block signup-new-submit']")).click();
	}
	
@AfterClass
	
	public void closeBrowser()
	{
		driver.quit();
	}
}

