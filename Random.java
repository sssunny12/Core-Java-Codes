import java.util.Scanner;

class Random

{
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		String f = scan.nextLine();
		char a = f.charAt(0);
		char z = f.charAt(2);		

		
		System.out.print("Enter Last Name: ");
		String l = scan.nextLine();
		char b = l.charAt(1);
		char y = l.charAt(2);

		
		System.out.print("Enter City: ");
		String c = scan.nextLine();
		char d = c.charAt(1);
		char x = c.charAt(3);

		
		System.out.print("Enter Mobile No.: ");
		String m = scan.nextLine();
		char e = m.charAt(4);
		char w = m.charAt(6);

		System.out.println("Password: " + a + z + b + y + d + x + e + w);



		
}
}