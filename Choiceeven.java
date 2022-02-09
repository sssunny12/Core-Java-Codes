import java.util.*;

class Choiceeven
{
	public static void main(String args[])
	{
		int teven=0;
		int todd=0;
		int sumeven=0;
		int sumodd=0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a start number: ");
		int s = scan.nextInt();

		System.out.print("Enter the end numbers: ");
		int e = scan.nextInt();

		System.out.println("Enter a choice: ");

		System.out.println("1 for odd numbers:");
		System.out.println("2 for even numbers: ");
		System.out.println("3 for both: ");

		int c = scan.nextInt();

		for(int i=s; i<=e; i++)
		{
		if(c==2 && i%2==0)
		{
			System.out.println(i + " even number ");
			teven++;
			sumeven+=i;
		
		}
		else if(c==1 && i%2==1)
		{
			System.out.println(i + " odd number ");
			todd++;
			sumodd+=i;
		
		
		}
		else if(c==3)
		{
		if(i%2==0)
		{
		System.out.println(i + " even number ");
			teven++;
			sumeven+=i;
		}
		if(i%2==1)
		{
		System.out.println(i + " odd number ");
			todd++;
			sumodd+=i;
		}
		
		}
		}

		if(c==2 && sumeven>sumodd)
		{
		System.out.println("total even numbers: " + teven);
		System.out.println("sum of all the even numbers: " + sumeven);
		}

		else if(c==1)
		{
		System.out.println("total odd numbers: " + todd);
		System.out.println("sum of all the odd numbers: " + sumodd);
		}

		else if(c==3)
		{
		System.out.println("total even numbers: " + teven);
		System.out.println("sum of all the even numbers: " + sumeven);
		System.out.println("total odd numbers: " + todd);
		System.out.println("sum of all the odd numbers: " + sumodd);
		System.out.println("sum of all the odd & even numbers: " + (sumodd+sumeven));		
		
		}

		if(c==3 && sumeven>sumodd)
		{
		System.out.println("sum of highest total is of even numbers: " + sumeven);
		}
		else if(c==3 && sumodd>sumeven)
		{
		System.out.println("sum of highest total is of odd numbers: " + sumodd);
		}
		
		

}
}