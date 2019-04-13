package day4;

public class DemoGuru99Project 
{

	public static void main(String[] args)
{
		
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.login("mngr188555", "Uhusaja");
		
		guru.addCustomer();
		
		String customerId = guru.getCustomerId();
	    
		System.out.println("Customer Id :" +customerId);
		
		guru.addAccount(customerId);
	}

}
