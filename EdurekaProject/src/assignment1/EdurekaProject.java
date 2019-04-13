package assignment1;

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

		driver.get("https://www.edureka.co");
	}
	
	public void printTitleOfThePage() 
	{
		String titleOfThePage = driver.getTitle();

		System.out.println("Title of the page : " + titleOfThePage);
	}

	
	

	public void searchPage()
	{
		driver.findElement(By.linkText("Corporate Training")).click();
		
		driver.findElement(By.xpath("//button[@data-button-name='Connect with us']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@data-gi-action='Top_Category_Software Testing']")).click();
		
		driver.findElement(By.xpath("//a[@data-gi-label='Card Position 1']")).click();
		
		driver.findElement(By.xpath("//a[@data-action='Clicked_On_Curriculum_Nav']")).click();
		
		driver.findElement(By.xpath("//a[@data-action='Clicked_On_FAQs_Nav']")).click();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
        driver.findElement(By.className("ga-allcourses")).click();
		
		driver.findElement(By.xpath("//button[@data-button-name='search_filter_individual_training_type']")).click();
		
		driver.findElement(By.xpath("//label[@for='selfpaced']")).click();
		
		driver.findElement(By.xpath("//button[@data-button-name='search_filter_individual_batch_type']")).click();
		
		driver.findElement(By.xpath("//label[@for='Weekend']")).click();
		
		driver.navigate().back();
				
		driver.findElement(By.className("ga-blog")).click();
				
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
		driver.findElement(By.xpath("//input[@class='search_inp collapse giTrackElementHeader']")).sendKeys("Testing");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@id='search-button-top']")).click();
		
		driver.findElement(By.xpath("//h3[text()='Manual Testing Certification Training']")).click();
		
        driver.findElement(By.xpath("//a[@data-action='Clicked_On_Curriculum_Nav']")).click();
        
        driver.findElement(By.xpath("//a[@data-action='Clicked_On_Certification_Nav']")).click();
		
		driver.findElement(By.xpath("//a[@data-action='Clicked_On_FAQs_Nav']")).click();		
		
		driver.navigate().back();
		
		driver.navigate().back();		
		
		driver.navigate().back();
		
	} 
			
	public void homePageDemo()
		
	{		
		driver.findElement(By.linkText("About us")).click();
		
		driver.findElement(By.linkText("CULTURE")).click();
		
		driver.close();
					
	}
	
}
