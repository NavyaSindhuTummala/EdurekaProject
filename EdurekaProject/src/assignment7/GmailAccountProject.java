package assignment7;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GmailAccountProject 
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

		driver.get("https://www.gmail.com");
	}
	
@Test(priority=0)
	
	public void verifyTitleOfThePage()
	{
		
		String titleOfThePage = driver.getTitle();
		
		System.out.println("Title :"+titleOfThePage);
		
	}
	
@Parameters({"userid","userPass"})
@Test (priority=1000)

public void verifyLoginToGmail()
{
	 String userId = "navyasindhutummala@gmail.com";
	
     String userPassword = "8008472874";
	
		
		
    /*    WebElement userIdElement;
		
		userIdElement = driver.findElement(By.xpath("///input[@type='email']"));
		
		userIdElement.sendKeys(userId); */
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userId);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
   /*     WebElement userPassElement;
		
		userPassElement = driver.findElement(By.xpath("//input[@type='password']"));
		
		userPassElement.sendKeys(userPassword);  */
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(userPassword);
		
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	} 

@Test (priority=2000)
public void composeMail() throws InterruptedException
{
	
	 String emailId = "kavuri.harish@gmail.com";
	 
	Actions action = new Actions(driver);
	
	 WebElement composeButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		
	    waitTillElementVisibleWithFluentWait(10, By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"), 0);		
		
	    action.moveToElement(composeButton).click().build().perform();  
   
  //  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
    
    driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(emailId);
    
    driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
    
    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Test");
    
    driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
    
} 
private void waitTillElementVisibleWithFluentWait(int timeOutInSeconds, By locator, int pollingTime) 
{

	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOutInSeconds))
			.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);

	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}

@Test (priority=3000)
public void logout()
{
	driver.findElement(By.xpath("//span[@class='gb_ya gbii']")).click();
	driver.findElement(By.xpath("//a[@class='gb_0 gb_Ff gb_Nf gb_me gb_kb']")).click();
}
	
}
