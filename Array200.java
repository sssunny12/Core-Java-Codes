import java.util.Scanner;

class Array200
{
	public static void main(String args[])
	{
		String names[][] = new String[2][2];
		Scanner scan = new Scanner(System.in);
		
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println("Enter data: ");
			names[i][j] = scan.nextLine();
		}
	}

for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("\t" + names[i][j]);
			}
		System.out.println();
		}

	}
}


