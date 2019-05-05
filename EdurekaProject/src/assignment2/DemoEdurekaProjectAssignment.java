package assignment2;

public class DemoEdurekaProjectAssignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		EdurekaProjectAssignment edu = new EdurekaProjectAssignment();
		
		edu.invokeBrowser();
		
		edu.printTitleOfThePage();
		
		edu.login("navyasindhutummala@gmail.com", "Tns@1206");
		
		edu.courseSearchBox();
		
	}

}
