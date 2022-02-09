import java.util.Scanner;

class Twelve
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		int num;
		System.out.print("Enter the first number: ");
		int num1 = scan.nextInt();

		
		System.out.print("Enter the second number: ");
		int num2 = scan.nextInt();

		
		System.out.print("Enter the third number: ");
		int num3 = scan.nextInt();


		if(num1!=num2  && num2!=num3 && num3!=num1)
		System.out.println("Yes the three numbers are different.");
		else
		System.out.println("No the three numbers are not different.");
}
}