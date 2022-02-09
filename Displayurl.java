import java.util.Scanner;

class Displayurl

{
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Email: ");
		String email = scan.nextLine();

		String ss[] = email.split("@");

//System.out.println(ss[0]);

//System.out.println(ss[1]);
		int l= ss.length;

		System.out.println("http://www." + ss[1]);

}
}
