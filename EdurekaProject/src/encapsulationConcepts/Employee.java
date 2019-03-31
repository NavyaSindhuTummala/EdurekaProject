package encapsulationConcepts;

public class Employee 
{
   private int salary;
   private int bonus;
	
	void calculateSalary()
	{
		int totalSalary;
		totalSalary = salary + bonus;
		System.out.println("The Total salary is :" +totalSalary);
	}
	
	 public void setSalary(int salary)
	 {
		 if(salary>0)
		 {
		 this.salary = salary;
	     }
		 else
		 {
			 System.err.println("Invalid Salary");
		 }
     }

	

	public void setBonus(int bonus) 
	{
		if(bonus>0)
		 {
		 this.bonus = bonus;
	     }
		 else
		 {
			 System.err.println("Invalid Bonus");
		 }
    }


	 public int getsalary()
	 {
		 return salary;
	 }

	public int getBonus() 
	{
		return bonus;
	}

}
