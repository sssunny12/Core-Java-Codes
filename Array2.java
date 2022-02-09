import java.util.Scanner;

class Array2
{
	public static void main(String args[])
	{
		

		Scanner scan = new Scanner(System.in);	

		String names[] = new String[10];

		for(int i=0; i<names.length;i++)
		{
			System.out.print("Enter the name for " + i + " : "  );

			names[i] = scan.nextLine();
		}	

		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}