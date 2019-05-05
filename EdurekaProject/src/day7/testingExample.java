package day7;

import org.testng.annotations.Test;

public class testingExample 
{

	@Test
	
	public void testCase9()
	{
		System.out.println("Test Case 3 from a Class 2");
	}
	
	@Test(groups = "Sanity")
	public void testCase10()
	{
		System.out.println("Test Case 10 from a Class 2");
	}
	
	@Test(groups = "Sanity")
	public void testCase11()
	{
		System.out.println("Test Case 11 from a Class 2");
	}
	
	@Test
	public void testCase19()
	{
		System.out.println("Test Case 19 from a Class 2");
	}
	
}
