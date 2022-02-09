import java.util.Scanner;

class Arrayy
{
	public static void main(String args[])
	{
		

		Scanner scan = new Scanner(System.in);	

		String names[] = new String[10];

		for(int i=0; i<names.length;i++)
		{
			System.out.print("Enter the name for " + i + " : "  );

			String n = scan.nextLine();

			names[i]=n;
		}	

			for(String a : names)

			System.out.println(a);

	}
}