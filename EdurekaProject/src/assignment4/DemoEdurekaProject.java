package assignment4;


public class DemoEdurekaProject 
{

	public static void main(String[] args) throws InterruptedException
	{
		EdurekaProject edu = new EdurekaProject();
		
		edu.invokeBrowser();
		
		edu.printTitleOfThePage();
				
		edu.login("navyasindhutummala@gmail.com", "Tns@1206");
		
		edu.myProfileDemo();
		
	//	edu.courseSearchBox();
		
	//	edu.homePageDemo();
		
	}

}
