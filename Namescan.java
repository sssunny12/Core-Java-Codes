import java.util.Scanner;

class Namescan
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String f = scan.nextLine();
		char c = f.charAt(0);
		

		System.out.print("Enter your middle name: ");
		String m = scan.nextLine();
		char d = m.charAt(0);
		

		System.out.print("Enter your last name: ");

		String l = scan.nextLine();
	

		System.out.println("Name is: " + f + " " + m + " " + l);

		System.out.println("Name is: " + m + " " + f + " " + l);

		System.out.println("Name is: " + l + " " + m + " " + f);

		System.out.println("Name is: " + c + "." + d + "." + l); 
	
}
}