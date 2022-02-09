import java.util.*;

class More
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);


		System.out.print("Enter first number: ");
		int num1 = scan.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scan.nextInt();


		System.out.println("Sum = " + (num1+num2));

		int i=0;

		while(i<5)
		{

		System.out.print("Do you want to add more numbers(y/n)?: ");
		char ans = scan.next().charAt(0);



		if(ans=='y')
		{
		System.out.println("Add more numbers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		System.out.println("Sum = " + (num1+num2));
		}

		else if(ans=='n')
		{
			System.out.println("exit.");
			break;
		}
		}

		
}
}