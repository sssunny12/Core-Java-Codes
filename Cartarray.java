import java.util.*;

class Cartarray
{
	public static void main(String args[])

	{

		Scanner scan = new Scanner(System.in);

		int number[] = new int[5];
		int number2[] = new int[5];

		for(int i=0; i<5; i++)
		{

		System.out.print("Enter first 5 numbers: ");
		number[i] = scan.nextInt();
		}
		
		for(int j=0; j<5; j++)
		
		{
		System.out.print("Enter second 5 numbers: ");
		number2[j] = scan.nextInt();
		}

		for(int i=0; i<5; i++)
		{
		for(int j=0; j<5; j++)
		{

			System.out.println(number[i] + "," + number2[j]);
			}
			}


			


		




		



}
}