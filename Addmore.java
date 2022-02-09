import java.util.Scanner;

class Addmore
{
	public static void main(String args[])
	{


		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int Num1 = scan.nextInt();

		System.out.print("Enter second number: ");
		int Num2 = scan.nextInt();

		System.out.println("Result = " + (Num1 + Num2));

		int counter=0;

		while(counter < 5)
		{

		System.out.print("Do you want to add more numbers (y/n): ");
		char ans = scan.next().charAt(0);

		if(ans=='y')
		{
			System.out.print("Add more numbers: ");
			Num1 = scan.nextInt();
			Num2 = scan.nextInt();
			System.out.println("Result = " + (Num1 + Num2));
		}

		else if(ans=='n')
		{
			System.out.println("Exit");
			break;
			}
		
		}

}
}