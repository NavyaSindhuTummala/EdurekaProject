package day3;

public class DemoWorkingWithFirefox 
{

	public static void main(String[] args) 
	{
		
		WorkingWithFirefox wff = new WorkingWithFirefox();
		
		wff.invokeBrowser();
		
		wff.printTitleOfThePage();
		
		wff.navigateCommands();

		wff.closeBrowser();
	}

}