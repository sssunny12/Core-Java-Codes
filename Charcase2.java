import java.util.*;

class Charcase2
{
	public static void main(String args[])

	{

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a char: ");
		char c = scan.next().charAt(0);
	
		System.out.println(c);

		int x = c;

		System.out.println(x);


	if(x>=65 && x<=90)
		{
		x = x+32;
		c = (char)x;
		System.out.println(c);
		}
		else if(x>=97 && x<=122)
	{
		x = x-32;
		c = (char)x;
		System.out.println(c);
	}

		
}
}