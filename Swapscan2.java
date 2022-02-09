import java.util.Scanner;

class Swapscan2
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of x: ");
		int x = scan.nextInt();

		System.out.print("Enter the value of y: ");
		int y = scan.nextInt();

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
}
}