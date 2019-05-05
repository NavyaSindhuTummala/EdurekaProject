package day7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTesting 
{
	
    @Test(priority=0)

    public void testcase7()
    {
	    System.out.println("Test Case 7");
    }

	@Test(priority=1000, groups ="Sanity")
	
	public void testcase1()
	{
		System.out.println("Test Case 1");
	}
	
    @Test(priority=-1000, groups ="Sanity")
	
	public void testcase8()
	{
		System.out.println("Test Case 8");
	}

    @Test(priority=2000, enabled=false)

    public void testcase3()
    {
	    System.out.println("Test Case 3");
    }
    
    @Test(priority=3000)

    public void testcase4()
    {
	    System.out.println("Test Case 4");
    }
    
    @BeforeMethod
    
    public void beforeAMethod()
    {
    	System.out.println("Before a Method");  	
    }
    
    @AfterMethod
    
    public void afterAMethod()
    {
    	System.out.println("After a Method"); 
    }
    
    @BeforeClass
    
    public void beforeAClass()
    {
    	System.out.println("First Method to be executed when a class loads");
    }
    
 @AfterClass
    
    public void afterAClass()
    {
    	System.out.println("Last Method to be executed in a class loads");
    }
	
}
