import java.util.*;

class Marketing
{
	void Detail(String na, double ba)
	{

	System.out.println("name = " + na);
	System.out.println("basic salary = " + ba);
double ta = 10*(ba/100);
	System.out.println("Ta = " + ta);

	
	
}		
}

class IT extends Marketing
{

	System.out.println("Ta = " + );


}

class Department
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		
		System.out.print("Enter the name: ");
		String na = scan.nextLine();

		System.out.print("Enter the basic salary: ");
		double ba = scan2.nextDouble();


		IT obj = new IT();
		obj.Detail(na,ba);
		obj.Add(ta,ba);
		
		
		



		
		
}
}