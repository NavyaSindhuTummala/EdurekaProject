package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver;
		{
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Harish/Desktop/Selenium/Softwares Download/chromedriver_win32/chromedriver.exe");

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
      
			driver.switchTo().frame("iframeResult");
			
		//  Switch back from a Frame	
		//	driver.switchTo().defaultContent();
			
			driver.findElement(By.tagName("button")).click();
			
			Thread.sleep(3000);
			
			Alert alert = driver.switchTo().alert();
			
			System.out.println(alert.getText());
			
			alert.dismiss();
			
	     }

    }
}
