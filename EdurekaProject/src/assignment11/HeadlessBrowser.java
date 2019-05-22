package assignment11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;


public class HeadlessBrowser 
{

	@Test
	public void test1() {
		// Creating a new instance of the HTML unit driver

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navigate to Google
		driver.get("https://www.edureka.co");
		
		WebElement login = driver.findElement(By.linkText("Log In"));
		
		login.click();
				
		// Locate the searchbox using its name
		WebElement email = driver.findElement(By.xpath("//input[@id='si_popup_email']"));

		// Enter a search query
		email.sendKeys("navyasindhutummala@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@id='si_popup_passwd']"));

		// Enter a search query
		pass.sendKeys("Tns@1206");

		driver.findElement(By.xpath("//button[text()= 'Login']")).click();


		// This code will print the page title
		System.out.println("Page title is: " + driver.getTitle());

	}

}
