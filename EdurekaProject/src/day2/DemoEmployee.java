package day2;

public class DemoEmployee 
{

	public static void main(String[] args) 
	{
		//Declaring the Variable
		Employee Navya;
		
		Navya = new Employee();
		
		Navya.salary = 950000;
		Navya.bonus = 55000;
		Navya.calculateSalary();
		
		Employee Sindhu = new Employee();
		
		Sindhu.salary = 585000;
		Sindhu.bonus = 28000;
		Sindhu.calculateSalary();
		
		Employee Lipsy = new Employee();
		
		Lipsy.salary = 1005800;
		Lipsy.bonus = 54030;
		int LipsySalary = Lipsy.calculateSalary1();
		System.out.println("Lipsy's Salary is :" +LipsySalary);
		
		
		Employee Ashri = new Employee();
		
	    int AshriSalary =	Ashri.calculateSalary1(1500000, 25000);
	    System.out.println("Ashri's Salary is:" +AshriSalary);
	    
         Employee Ashritha = new Employee();
         Ashritha.salary = 1200000;
 		 Ashritha.bonus = 85000;
		
	    int AshrithaSalary =	Ashritha.calculateSalary2(1800000, 25000);
	    System.out.println("Ashritha's Salary is:" +AshrithaSalary);
	    
	    Employee Harish = new Employee();
        Harish.salary = 1540000;
        Harish.bonus = 160000;
		
	    int HarishSalary =	Harish.calculateSalary3(1800000, 25000);
	    System.out.println("Harish's Salary is:" +HarishSalary);
		
	}

}
