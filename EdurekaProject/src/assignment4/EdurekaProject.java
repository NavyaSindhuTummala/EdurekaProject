package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdurekaProject 
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
		String titleOfThePage = driver.getTitle();

		System.out.println("Title of the page : " + titleOfThePage);
	}

	
	public void login(String Id, String Password) 
	{
		driver.findElement(By.linkText("Log In")).click();
		
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys(Id);
		
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[text()= 'Login']")).click();
			
	} 
	
	public void myProfileDemo() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']/span[@class='webinar-profile-name']")).click();
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@data-button-name='My Profile']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@id='personal_details']/i[@class='icon-pr-edit']")).click();
		
	//	driver.findElement(By.xpath("//input[@name='fullname']")).click();
		
		driver.findElement(By.xpath("//input[@name='fullname']")).clear();
		
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys(" Sindhu");
		
	//	driver.findElement(By.xpath("//input[@name='phone_number']")).click();
		
		driver.findElement(By.xpath("//input[@name='phone_number']")).clear();
		
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("9652851400");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default pull-right verify-continue-btn']")).click();
		
				
	//	driver.findElement(By.xpath("//input[@name='userSkill']")).click();
			
		driver.findElement(By.xpath("//input[@class='form-control form-element ng-pristine ng-valid ng-touched']")).clear();
		
		driver.findElement(By.xpath("//input[@class='form-control form-element ng-pristine ng-valid ng-touched']")).sendKeys(",Automation");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

	//	Select selectDropdown = new Select(dropdown);

	//	selectDropdown.selectByVisibleText(category);
		
		driver.findElement(By.xpath("//label[@class=\"radio-inline\"]/input[@value='true']")).click();
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn pull-right onboarding-primary-button\"]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//section[@class=\"container-fluid bread_crum\"]//div[@class='col-lg-8 col-md-7 col-sm-6 col-xs-12 no-padding bread_left hidden-xs']//a[1]")).click();
		
		driver.findElement(By.className("ga-blog")).click();
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@data-button-name='Logout']")).click();
		
		driver.close();
		
	}
	
}
