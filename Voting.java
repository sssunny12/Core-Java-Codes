import java.util.Scanner;

class Voting
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		int num=0;

		System.out.print("Enter the age: ");
		int age = scan.nextInt();

		if(age>=18)
		System.out.println("The person can vote: ");
		else
		System.out.println("The person cannot vote: ");
}
}