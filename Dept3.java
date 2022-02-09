import java.util.*;

class Employee
{
	int empid;
	String empname;
	double salary;

	public double calculatesalary()
	{
		return salary;
	}

public void getSalaryData()
{
Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);

System.out.print("Enter employee id: ");
		empid = scan.nextInt();

		System.out.print("Enter employee name: ");
		empname = scan2.nextLine();

		System.out.print("Enter salary: ");
		salary = scan3.nextDouble();


}

}

class IT extends Employee
{
	public double calculatesalary()
	{
	getSalaryData();
                double ta = salary*.20;
		double da = salary*.15;
		double totalsalary = salary+ta+da;
		return totalsalary;
	}

}

class Marketing extends Employee
{
	public double calculatesalary()
	{
getSalaryData();

                double ta = salary*.25;
		double da = salary*.20;
		double totalsalary = salary+ta+da;
		return totalsalary;
	}

}

class Dept3
{
	public static void main(String args[])
	{
		IT obj = new IT();
		salary = obj.calculatesalary();
		System.out.println(salary);

		Marketing obj1 = new Marketing();
		salary = obj1.calculatesalary();
		System.out.println(salary);
	}
}