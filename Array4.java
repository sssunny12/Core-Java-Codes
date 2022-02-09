import java.util.Scanner;

class Array4
{
	public static void main(String args[])
	{
		String names[] = new String[10];

		Scanner scan = new Scanner(System.in);	

		for(int i=0; i<names.length;i++)
		{
			System.out.print("Enter the name for " + i + " : "  );

			names[i] = scan.nextLine();
		}	

		for(String n : names)
		{
			System.out.println(n);
		}
	}
}