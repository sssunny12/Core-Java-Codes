import java.util.Scanner;

class Highest
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		

		System.out.print("Enter the first number: ");
		int num1 = scan.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scan.nextInt();

		if(num1> num2)
			System.out.println("Highest number is: " + num1);
		else 
			System.out.println("Highest number is: " + num2);
		
		
		
		

		
}
}