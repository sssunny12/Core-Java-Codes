import java.util.Scanner;

class Namescan1
{
	public static void main(String args[])
	{
		char c = args[0].charAt(0);
		char d = args[1].charAt(0);
		
		String l = args[2];
	

		System.out.println("Name is: " + args[0] + " " + args[1] + " " + l);

		System.out.println("Name is: " + args[1] + " " + args[0] + " " + l);

		System.out.println("Name is: " + l + " " + args[1] + " " + args[0]);

		System.out.println("Name is: " + c + "." + d + "." + l); 
	
}
}