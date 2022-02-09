import java.util.Scanner;

class Startend
{
	public static void main(String args[])
	{
		int i;	
		int todd=0;
		int teven=0;	
                int choice=0;
		int sumodd=0;
		int sumeven=0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a start number: ");
		int s = scan.nextInt();

		
		System.out.print("Enter a end number: ");
		int e = scan.nextInt();

			System.out.print("Enter a choice 1,2,3: ");
			System.out.print("1 for odd no.: ");
			
			System.out.print("2 for even no.: ");

			System.out.print("3 for both.: ");

			choice = scan.nextInt();

		for(i=s; i<=e; i++)
		{
			if(choice==2 && i%2==0)	
			{
				System.out.println(i + " is even ");
				teven++;
				sumeven=sumeven+i;
				
				
			}
			else if(choice==1 && i%2==1)
			{
				System.out.println(i + " is odd ");
				todd++;	
				sumodd=sumodd+i;
			}
			else if(choice==3)
			{
				if(i%2==1)
				{
				System.out.println(i + " is odd ");
				todd++;
				sumodd=sumodd+i;	
				}
				else if(i%2==0)
				{
				System.out.println(i + " is even ");
				teven++;
				sumeven=sumeven+i;	
				}
					

			}
			

		}

{
		if(choice==1)
			{
			System.out.println("odd: " + todd);
			
			System.out.println("Total of odd numbers: " + sumodd);
			}
			
		else if(choice==2)
			{ 
			System.out.println("even: " + teven);
	
			System.out.println("Total of even numbers: " + sumeven);
			}
			
		else if(choice==3)
			{

			System.out.println("odd: " + todd);
			
			System.out.println("even: " + teven);

			System.out.println("Total of all numbers: " + (sumeven+sumodd));

			}
		}

			{

		if(choice==3 && sumeven>sumodd)
			{

			System.out.println("The even number is higher: " + sumeven);
			}
		else if(choice==3 && sumodd>sumeven)
			{

			System.out.println("The odd number is higher: " + sumodd);
}
}

		


		
}
}