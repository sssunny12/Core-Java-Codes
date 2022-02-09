import java.util.Scanner;

class Salary2
{
		public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the name1: ");
		String name1 = scan.nextLine();

		System.out.print("Enter the department1: ");
		String department1 = scan.nextLine();

		System.out.print("Enter the basic_salary1: ");
		double basic_salary1 = scan.nextDouble();

	
		double ta1 = 10*basic_salary1/100;

		double da1 = 20*basic_salary1/100;

		double hra1 = 30*basic_salary1/100;

		double gross_salary1 = basic_salary1 + ta1 + da1 + hra1;

		double pf1 = 10*gross_salary1/100;

		double insurance1 = 500;

		double net_salary1 = gross_salary1 - pf1 - insurance1;		

		System.out.println("T.A1 = " + ta1);

		System.out.println("D.A1 = " + da1);

		System.out.println("H.R.A1 = " + hra1);

		System.out.println("Gross-salary1 = " + gross_salary1);

		System.out.println("P.F1 = " + pf1);

		System.out.println("Insurance1 = " + insurance1);

		System.out.println("Net-salary1 = " + net_salary1);
				
		


		System.out.print("Enter the name: ");
		String name = scan.nextLine();

		System.out.print("Enter the department: ");
		String department = scan.nextLine();

		System.out.print("Enter the basic_salary: ");
		double basic_salary = scan.nextDouble();

		double ta = 20*basic_salary/100;

		double da = 25*basic_salary/100;

		double hra = 35*basic_salary/100;

		double gross_salary = basic_salary + ta + da + hra;

		double pf = 15*gross_salary/100;

		double insurance = 1000;

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