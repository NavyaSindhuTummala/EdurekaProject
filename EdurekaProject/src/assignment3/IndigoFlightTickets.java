package assignment3;

import java.util.concurrent.TimeUnit;

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
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

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
		
	//	driver.findElement(By.xpath("//input[@class='form-control or-src-city']")).click();
		
		driver.findElement(By.xpath("//input[@data-parsley-airport-message='Please select a Source']")).clear();
		
		driver.findElement(By.xpath("//input[@class='form-control or-src-city']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-parsley-airport-message='Please select a Source']")).sendKeys("BLR");
		
		driver.findElement(By.xpath("//div[@class='col-sm-5 col-5 padd-left']/div/div/div/div/div[@data-name='Bengaluru']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='form-control or-dest-city']")).sendKeys("LKO");
		
		driver.findElement(By.xpath("//div[@class='col-sm-5 col-5 padd-right']/div/div/div/div/div[@data-name='Lucknow']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='form-control or-depart igInitCalendar focus']")).click();
				
	    driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		
	    Thread.sleep(3000);
	    
		driver.findElement(By.xpath("//input[@class='form-control hpBookingForm passengerInputField pax-class-count']")).click();
		
		driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//li[@class='adult-pax-list']//button[@class='pax-plus btn btn-info']")).click();
		
		driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//li[@class='adult-pax-list']//button[@class='pax-plus btn btn-info']")).click();

        driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//li[@class='child-pax-list']//button[@class='pax-plus btn btn-info']")).click();
		
		driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//li[@class='child-pax-list']//button[@class='pax-plus btn btn-info']")).click();
		
		driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//li[@class='infant-pax-list']//button[@class='btn btn-info pax-minus']")).click();
	  
		Thread.sleep(5000);
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	   driver.findElement(By.xpath("//button[@class='btn btn-primary pax-done']")).click();
	    
	   Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//span[@class='hp-src-btn']")).click();
	    
		
	}
	
}
