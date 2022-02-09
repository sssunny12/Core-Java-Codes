import java.util.Scanner;

class Email

{
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Email: ");
		String email = scan.nextLine();

		int i = 0;

		while(i<email.length())
		{
		i++;
		}

		if((email.indexOf('@') >=0) && (email.endsWith(".in") || email.endsWith(".com")))

		System.out.println("the email is correct");

		else
			System.out.println("the email is incorrect");


}
}