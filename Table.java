import java.util.*;

class Table
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

	System.out.print("Enter a number to print its table: ");
	int t = scan.nextInt();

	for(int i=1; i<=10; i++)
	{
	System.out.println("table: " + t + " x " + i + " = " + (t*i));
	}


}
}