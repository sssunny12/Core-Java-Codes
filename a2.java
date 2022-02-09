import java.util.Scanner;

class a2
{
	public static void main(String args[])
	{
		int i, j, n, temp;

		Scanner scan = new Scanner(System.in);

		
		System.out.print("Enter the elements: ");
		n = scan.nextInt();

		int a[] = new int[n];

		System.out.println("Enter all the elements: ");
		for(i=0; i<n; i++)
		{
		a[i] = scan.nextInt();
		}

		System.out.println("before sorting...");
for(i=0; i<n; i++)
		{
		System.out.println(a[i]);
		}
		for(i=0; i<n; i++)
		{
			for(j=i; j<n; j++)
			{		

		if(a[i] > a[j])
		{
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
	     }
	  }

System.out.println("after sorting...");

		for(i=0; i<n; i++)
		{
		System.out.println(a[i]);
		}
		//System.out.println(a[n]);
		
		

}
}