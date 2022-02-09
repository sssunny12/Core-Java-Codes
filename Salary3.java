import java.util.Scanner;

class Salary3
{
	public static void main(String args[])
	{

	Scanner scan = new Scanner(System.in);


	System.out.print("Enter the name: ");
	String name = scan.nextLine();

	System.out.print("Enter the department: ");
	String department = scan.nextLine();

	
	System.out.print("Enter the basic_salary: ");
	double basic_salary = scan.nextDouble();

	if(department.equals("IT"))
{
	System.out.println("IT");

	double ta = basic_salary*.10;
	double da = basic_salary*.20;
	double hra = basic_salary*.30;

	double gross_salary = basic_salary+ta+da+hra;

	double pf = gross_salary*.10;
	double insurance = 500;
	double deduction = pf - insurance;
	
	double net_salary = gross_salary - deduction;

	System.out.println("Ta: " + ta);
	System.out.println("Da: " + da);
	System.out.println("Hra: " + hra);
	System.out.println("Gross salary: " + gross_salary);
	System.out.println("PF: " + pf);
	System.out.println("Insurance: " + insurance);
	System.out.println("Net salary: " + net_salary);
}



	else if(department.equals("MKT"))
{
	System.out.println("MKT");

	double ta = basic_salary*.15;
	double da = basic_salary*.25;
	double hra = basic_salary*.35;

	double gross_salary = basic_salary+ta+da+hra;

	double pf = gross_salary*.15;
	double insurance = 1000;
	double deduction = pf - insurance;
	
	double net_salary = gross_salary - deduction;

	System.out.println("Ta: " + ta);
	System.out.println("Da: " + da);
	System.out.println("Hra: " + hra);
	System.out.println("Gross salary: " + gross_salary);
	System.out.println("PF: " + pf);
	System.out.println("Insurance: " + insurance);
	System.out.println("Net salary: " + net_salary);

}






}
}	