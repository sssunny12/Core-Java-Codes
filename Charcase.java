import java.util.*;

class Charcase
{
	public static void main(String args[])

	{

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a char: ");
		String s = scan.nextLine();
	
		
		if(s.charAt(0)>=65 && s.charAt(0)<=90)

		System.out.println(s.toLowerCase());

		else if(s.charAt(0)>=97 && s.charAt(0)<=122)
		System.out.println(s.toUpperCase());			


		
}
}