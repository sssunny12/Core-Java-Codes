import java.util.*;
class Employee
{
	int empid;
	String empname;
	double salary;
	public double calculatesalary(double salary, double ta, double da)
	{
		return salary;
	}

}

class IT extends Employee
{
	public double calculatesalary(double salary, double ta, double da)	
	{
	double totalsalary = salary+ta+da;
	return totalsalary;
	
}	
}

class Marketing extends Employee
{
	public double calculatesalary(double salary, double ta, double da)
	{

	double totalsalary = salary+ta+da;
	return totalsalary;
	
}
}

class Dept1
{
	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);

		System.out.print("Enter choice (1 for IT and 2 for Marketing): ");
		int c = scan.nextInt();

		if(c==1)
		{
		System.out.print("Enter employee id: ");
		int empid = scan.nextInt();

		System.out.print("Enter employee name: ");
		String empname = scan2.nextLine();

		System.out.print("Enter salary: ");
		double salary = scan3.nextDouble();

		System.out.print("Enter ta: ");
		double ta = scan3.nextDouble();

		System.out.print("Enter da: ");
		double da = scan3.nextDouble();

		IT obj = new IT();
		salary = obj.calculatesalary(salary,ta,da);
		System.out.println(salary);
		}

		else
		{
		System.out.print("Enter employee id: ");
		int empid = scan.nextInt();

		System.out.print("Enter employee name: ");
		String empname = scan2.nextLine();

		System.out.print("Enter salary: ");
		double salary = scan3.nextDouble();

		System.out.print("Enter ta: ");
		double ta = scan3.nextDouble();

		System.out.print("Enter da: ");
		double da = scan3.nextDouble();
		

		Marketing obj1 = new Marketing();
		salary = obj1.calculatesalary(salary,ta,da);
		System.out.println(salary);
		}

}
}