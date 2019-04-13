package assignment3;

public class DemoIndigoFlightTickets 
{

	public static void main(String[] args) throws InterruptedException 
	{
		IndigoFlightTickets ift = new IndigoFlightTickets();
		
		ift.invokeBrowser();
		
		ift.printTitleOfThePage();
		
		ift.searchForFlights();

	}

}
