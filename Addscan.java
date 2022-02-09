import java.util.Scanner;

class Addscan
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);


		System.out.print("x = 10 ");
		int x = scan.nextInt();
		
		System.out.print("y = 20 ");
		int y = scan.nextInt();


		System.out.println(x+y);
