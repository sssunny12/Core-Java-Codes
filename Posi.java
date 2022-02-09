import java.util.*;

class PositiveNumber
{

	public static void main(String args[])
	{
	
	Positive obj = new Positive();

	Scanner sc = new Scanner(System.in);
		
	System.out.print("Input: ");
	int n = sc.nextInt();
		
	obj.SumOfNPositiveNumber(n);
	
}
}

class Positive
{
public static void SumOfNPositiveNumber(int n)
	{

int sum=0,i;
	for(i=0; i<=n; i++)
	
	{
	sum+=i;
	
	}
		
		System.out.println(sum);
	}

}


