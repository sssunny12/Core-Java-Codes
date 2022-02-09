import java.util.Scanner;

class Scanner1
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		int x = scan.nextInt();

		System.out.print("Enter the value of y: ");
		int y = scan.nextInt();

		int z = x+y;

		System.out.println(z); 
}
}