package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndigoFlightTickets
{

	ChromeDriver driver;

	public void invokeBrowser() 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Harish/Desktop/Selenium/Softwares Download/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.goindigo.in/?linkNav=home_header");
	}
	
	public void printTitleOfThePage() 
	{
		String titleOfThePage = driver.getTitle();

		System.out.println("Title of the page : " + titleOfThePage);
	}
	
	public void searchForFlights() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@class='form-control one-way-tab trip-tabs']")).click();
		
		driver.findElement(By.xpath("//input[@data-parsley-airport-message='Please select a Source']")).click();
		
		driver.findElement(By.xpath("//input[@data-parsley-airport-message='Please select a Source']")).clear();
		
		driver.findElement(By.xpath("//input[@data-parsley-airport-message='Please select a Source']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-parsley-airport-message='Please select a Source']")).sendKeys("BLR");
		
	//	driver.findElement(By.xpath("//input[@data-parsley-airport-message='Please select a Source']")).click();
		
		driver.findElement(By.xpath("//input[@name='or-dest']")).sendKeys("LKO");
		
	//	driver.findElement(By.linkText("Lucknow, India")).click();
		
	//	driver.findElement(By.xpath("//input[@class='form-control or-depart igInitCalendar focus']")).sendKeys("13 Apr 2019");
		
		driver.findElement(By.name("passenger")).click();
		
		Select AdultDropdown = new Select(driver.findElement(By.className("counter adult-pax")));

	    AdultDropdown.selectByValue("3");


	    Select ChildrenDropdown = new Select(driver.findElement(By.className("counter child-pax")));

	    ChildrenDropdown.selectByValue("2");
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-primary pax-done']")).click();
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-primary block bold ig-search-btn ig-common-cta addLoader']")).click();
	    
		
	}
	
}
