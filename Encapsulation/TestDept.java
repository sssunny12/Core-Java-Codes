class Employee
{
	int empid;
	String name;
	int salary;

	public double calculateSalary()
	{
		return salary;
	}
}

class Marketing extends Employee
{
	public double calculateSalary()
	{
		double da = salary*.10;
		double ta = salary*.15;
		double hra = salary*.10;
		double totalsalary = salary+ta+da+hra;
		return totalsalary;
	}

}
class IT extends Employee
{
	public double calculateSalary()
	{
		double da = salary*.10;
		double ta = salary*.10;
		double hra = salary*.20;
		double totalsalary = salary+ta+da+hra;
		return totalsalary;
	}

}


class TestDept
{
public static void main(String args[])
{
	Marketing obj = new Marketing();
		obj.salary = 10000;
		double salary = obj.calculateSalary();
		System.out.println(salary);

	IT obj2 = new IT();

		obj2.calculateSalary();

		salary = obj2.calculateSalary();
		System.out.println(salary);

}
}