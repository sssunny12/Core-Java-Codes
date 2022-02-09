import java.util.*;

class ArrayInteger
{
	public static void main(String args[])
	{
		
	
	Scanner sc = new Scanner(System.in);

	int sumeven=0,sumodd=0,n=4;

	int num[] = new int[n];

	for(int i=0; i<=n; i++)
	{
	System.out.print("Enter N integer Elements");
	num[i] = sc.nextInt();
	}

	for(int i=1; i<=n; i++)
	{

	if(n%2==0)
	{
	System.out.println("even");
	sumeven+=i;
	}
	else if(n%2==1)
	{
	System.out.println("odd");
	sumodd+=i;
	}
	}

	System.out.println("Sum Of Even Numbers: " + sumeven);

	System.out.println("Sum Of Odd Numbers: " + sumodd);	


	
	}
}
