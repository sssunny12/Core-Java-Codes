import java.util.Scanner;

class Tablewhile

{
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number to print multiplication table: ");
		int num = scan.nextInt();

		int i = 1;

		while(i <=10)
		
		{
		

		System.out.println(num +  " x " + i + " = " + num*i);

		i++;
		}
}
}