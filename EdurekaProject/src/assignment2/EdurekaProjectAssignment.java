package assignment2;

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
import org.openqa.selenium.support.ui.WebDriverWait;

public class EdurekaProjectAssignment 
{

	ChromeDriver driver;

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
	
	public void printTitleOfThePage() 
	{
		String titleOfTheHomePage = driver.getTitle();

		System.out.println("Title of the Home page : " + titleOfTheHomePage);
	}
	
	public void login(String Id, String Password) 
	{
		driver.findElement(By.linkText("Log In")).click();
		
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys(Id);
		
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[text()= 'Login']")).click();
			
	} 
	
	public void courseSearchBox() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='search_inp collapse giTrackElementHeader']")).sendKeys("Selenium");
		
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//i[@data-button-name='Search Icon']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
	//	driver.findElement(By.xpath("//h3[text()='Selenium Certification Training']")).click();
		
		WebElement seleniumLink = driver.findElement(By.xpath("//h3[text()='Selenium Certification Training']"));
		
		waitTillElementVisble(10, By.xpath("//h3[text()='Selenium Certification Training']"));
		
		action.moveToElement(seleniumLink).click().build().perform();

		String titleOfThePage = driver.getTitle();

		System.out.println("Title of the Search page : " + titleOfThePage);
		
        driver.findElement(By.xpath("//a[@data-action='Cliked_On_Home_Breadcrumbs']")).click();
        
        driver.findElement(By.xpath("//a[@data-button-name='Courses Dropdown']")).click();
        
        WebElement allCoursesLink = driver.findElement(By.xpath("//li[@class='ga-allcourses ga_ecom_info']"));
		
        waitTillElementVisibleWithFluentWait(10, By.xpath("//li[@class='ga-allcourses ga_ecom_info']"), 0);		
		
        action.moveToElement(allCoursesLink).click().build().perform();  
		
		
	} 
	
	private void waitTillElementVisble(int timeOutInSeconds, By locator) 
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	private void waitTillElementVisibleWithFluentWait(int timeOutInSeconds, By locator, int pollingTime) 
	{

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
