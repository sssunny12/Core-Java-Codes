class Employee
{
	int empid;
	String name;
	int salary;

	public void calculateSalary(double salary,double ta, double da)
	{
		
	}
}

class Marketing extends Employee
{
	public void calculateSalary(double salary,double ta, double da)
	{
		double totalsalary = salary+ta+da;
		System.out.println(totalsalary);
	}

}
class IT extends Employee
{
	public void calculateSalary(double salary,double ta, double da)
	{
		double totalsalary = salary+ta+da;
		System.out.println(totalsalary);
	}

}


class TestDept2
{
public static void main(String args[])
{
	Marketing obj = new Marketing();
	obj.calculateSalary(10000,1000,2000);
	

	IT obj2 = new IT();

		obj2.calculateSalary(10000,2000,4000);
		

}
}