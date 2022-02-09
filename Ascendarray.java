import java.util.*;

class Ascendarray
{
	public static void main(String args[])
	
	{
		int n=0;
		
		Scanner scan = new Scanner(System.in);


		int a[] = new int[5];
	
		for(int i=0; i<5; i++)
		{
		
			System.out.print("Enter the elements: ");
			a[i] = scan.nextInt();
		}
		
		
		for(int i=0; i<5; i++)
		{
		for(int j=i; j<5; j++)
		{
			if(a[i]>a[j])
		{
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
			}
		}
	}

		for(int i=0; i<5; i++)
			{
			System.out.println(a[i]);
		}



		

}
}