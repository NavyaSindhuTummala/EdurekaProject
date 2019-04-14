package day4.javaConcepts;

public class Car extends Machine
{
	
	public Car() 
	{
		
		super(4000);
		System.out.println("I am constructor from car class");
	}

	public void accelerate()
	{
		System.out.println("Accelerate Method from Car class");
	}
	
	public void deacelerate()
	{
		
		start();
		engineSize = 7000;
		System.out.println("Deacelerate Method from Car class");
	}
	
	@Override
	public void restart()
	{
		System.out.println("Restart Method from Car class");
	}

}