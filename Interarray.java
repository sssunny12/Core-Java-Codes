import java.util.*;

class Interarray
{
	public static void main(String args[])

	{
		int i,j;
		
		Scanner scan = new Scanner(System.in);

		int number[] = new int[5];
		int number1[] = new int[5];
		
		System.out.print("Enter first 5 numbers: ");

		for(i=0; i<5; i++)
		{

		number[i] = scan.nextInt();
		}

		
		System.out.print("Enter second 5 numbers: ");
		
		for(j=0; j<5; j++)

		{
		
		number1[j] = scan.nextInt();
		}

				
		for(i=0; i<5; i++)
		{
		for(j=0; j<5; j++)
		{

		if(number[i]==number1[j])
		
			
			System.out.println("number: " + number[i]);
		
				}
			}

			


		




		



}
}