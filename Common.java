import java.util.*;

class Common
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		String a[] = new String[10];
		for(int i=0; i<10; i++)
		{
		System.out.println("Enter 10 words:" + i);
		a[i] = scan.nextLine();
		}

		for(int i=0; i<10; i++)
		{
			if(a[i].indexOf(a[i])>=0)
			
			
		
		System.out.println(a[i]);
		}	


		
}
}