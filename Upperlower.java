import java.util.*;

class Upperlower
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char a = scan.next().charAt(0);

		System.out.println(a);

		int b = a;

		System.out.println(b);


		if(b>=65 && b<=90)
		{
		b = b+32;
		a = (char)b;
		System.out.println(a);
		}

		else if(b>=97 && b<=122)
		{
		b = b-32;
		a = (char)b;
		System.out.println(a);

		}

}
}