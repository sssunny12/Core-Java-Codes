import java.util.Scanner;

class Displaymsg
{
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the name: ");
		String name = scan.nextLine();

		for(int i=0; i<name.length(); i++)

		System.out.println("Welcome");

				
		for(int i=name.length()-1; i >=0; i--)

		System.out.print(name.charAt(i));





		

		

	
}
}