import java.util.Scanner;

class Bonus
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

	System.out.print("Enter the salary of employee: ");
	int salary = scan.nextInt();


	System.out.print("Enter the his/her year of service in company: ");
	int years = scan.nextInt();


	if(years>5)
{
	double bonus = salary*.05;
	System.out.println("Bonus = " + bonus);

	}

	else 
		System.out.println("No bonus");
}
}	