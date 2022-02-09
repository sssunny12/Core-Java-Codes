import java.util.Scanner;

class Salary
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("name: ");
		String name = scan.nextLine();

		System.out.print("department: ");
		String department = scan.nextLine();

		System.out.print("basic_salary: ");
		double basic_salary = scan.nextDouble();


		double ta = 10*basic_salary/100;

		double da = 20*basic_salary/100;

		double hra = 30*basic_salary/100;

		double gross_salary = basic_salary + ta + da + hra;

		double pf = 10*gross_salary/100;

		double insurance = 500;

		double net_salary = gross_salary - pf - insurance;		

		System.out.println("T.A = " + ta);

		System.out.println("D.A = " + da);

		System.out.println("H.R.A = " + hra);

		System.out.println("Gross-salary = " + gross_salary);

		System.out.println("P.F = " + pf);

		System.out.println("Insurance = " + insurance);

		System.out.println("Net-salary = " + net_salary);
		
}
}
