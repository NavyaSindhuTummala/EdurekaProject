package assignment1;


public class DemoEdurekaProject 
{

	public static void main(String[] args) throws InterruptedException
	{
		EdurekaProject edu = new EdurekaProject();
		
		edu.invokeBrowser();
		
		edu.printTitleOfThePage();
		
		edu.searchPage();
		
		edu.login("navyasindhutummala@gmail.com", "Tns@1206");
		
		edu.courseSearchBox();
		
		edu.homePageDemo();
		
	}

}
