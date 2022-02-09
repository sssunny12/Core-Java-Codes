import java.util.Scanner;

class Array3
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
			for(int i=0;i<n.length();i++)
			System.out.println(n.charAt(i));
		}
	}
}