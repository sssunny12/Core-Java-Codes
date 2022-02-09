import java.util.Scanner;

class Swappingscan
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("x: ");
		int x = scan.nextInt();

		System.out.print("y: ");
		int y = scan.nextInt();

		int temp = x;
		x = y;
		y = temp;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
}
}