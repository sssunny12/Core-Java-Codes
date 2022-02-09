class Employee
{
	int empid;
	String name;
	int salary;

	public double calculateSalary(double salary,double ta, double da)
	{
		return salary;
	}
}

class Marketing extends Employee
{
	public double calculateSalary(double salary,double ta, double da)
	{
		double totalsalary = salary+ta+da;
		return totalsalary;
	}

}
class IT extends Employee
{
	public double calculateSalary(double salary,double ta, double da)
	{
		double totalsalary = salary+ta+da;
		return totalsalary;
	}

}


class TestDept2
{
public static void main(String args[])
{
	Marketing obj = new Marketing();
		double salary = obj.calculateSalary(10000,1000,2000);
		System.out.println(salary);

	IT obj2 = new IT();

		salary = obj2.calculateSalary(10000,2000,4000);
		System.out.println(salary);

}
}