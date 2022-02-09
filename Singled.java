import java.util.*;

class Singled
{
	public static void main(String args[])

	{

		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
		{
		System.out.print("Enter 10 numbers: ");
		int n1 = scan.nextInt();
			arr[i] = n1;
		}
		
		for(int a : arr)
			System.out.println(a);

		



}
}