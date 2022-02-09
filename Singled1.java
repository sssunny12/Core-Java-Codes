import java.util.*;

class Singled1
{
	public static void main(String args[])

	{

		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
		{
		System.out.print("Enter 10 numbers: ");
		arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);

		}



}
}