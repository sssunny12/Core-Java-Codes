import java.util.*;

class Arithmatic
{
	public static void main(String args[])
	{
		int sum,multiply,divide,subtract;

		Scanner scan = new Scanner(System.in);

		int number[] = new int[5];

		for(int i=0; i<5; i++)

		{

		System.out.print("Enter first array numbers: " + i + " : ");
		number[i] = scan.nextInt();
		}

		int number1[] = new int[5];

		for(int i=0; i<5; i++)

		{

		System.out.print("Enter second array numbers: " + i + " : ");
		number1[i] = scan.nextInt();
		}

	System.out.print("Enter a Arithmatic symbol (either +, -, *, or /): ");
		char symbol = scan.next().charAt(0);


		for(int i=0; i<5; i++)
		{
		

		if(symbol=='+')
			{

		
			System.out.println(number[i] + " + " + number1[i] + " = " + (number[i]+number1[i]));
			}
		else if(symbol=='-')
			{

			
			System.out.println(number[i] + " - " + number1[i] + " = " + (number[i]-number1[i]));
			}

		else if(symbol=='*')
			{

			
			System.out.println(number[i] + " * " + number1[i] + " = " + (number[i]*number1[i]));
			}

		else if(symbol=='/')
			{
			
			System.out.println(number[i] + " / " + number1[i] + " = " + (number[i]/number1[i]));
			}




			

		}

			
				

		


}
}
