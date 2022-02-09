import java.util.*;

class Website
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter yoyr email address: ");
		String email = scan.nextLine();

		String ss[] = email.split("@");

		System.out.println("http://www." + ss[1]);

		

}
}