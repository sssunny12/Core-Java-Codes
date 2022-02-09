import java.util.*;

class Oddeven
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

		System.out.print("Enter a end number: ");
		int e = scan.nextInt();

		for(int i=s; i<=e; i++)
		{
		if(i%2==0)
		{
		System.out.println(i + " even number ");
		teven++;
		sumeven+=i;
		}
		else if(i%2==1)
		{
		System.out.println(i + " odd number ");
		todd++;
		sumodd+=i;
		}
		}
		
		{
		System.out.println("total even numbers: " + teven);

		System.out.println("total odd numbers: " + todd);

		System.out.println("sum of all even numbers: " + sumeven);

		System.out.println("sum of all odd numbers: " + sumodd);

		System.out.println("sum of all even and odd numbers: " + (sumeven+sumodd));
		}

		if(sumeven>sumodd)
		{
		System.out.println("the highest total is of even nnumbers: " + sumeven);
		}

		else
		{
		System.out.println("the highest total is of odd numbers: " + sumodd);
		}


}
}