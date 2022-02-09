import java.util.Scanner;

class Minusarray
{
	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);

		int number[] = new int[5];
		int number1[] = new int[5];
		boolean found=true;

		for(int i=0; i<5; i++)
		{

		System.out.print("Enter first 5 numbers: ");
		number[i] = scan.nextInt();
		}

		
		for(int j=0; j<5; j++)
		{

		System.out.print("Enter second 5 numbers: ");
		number1[j] = scan.nextInt();
		}
		for(int i=0; i<5; i++)
		{
		for(int j=0; j<5; j++)
		{

		if(number[i]==number1[j])
			{
			found=false;
			break;
			}
		else
			found=true;
		}
			if(found==true)
			
			System.out.println(number[i]);
		}


}
}