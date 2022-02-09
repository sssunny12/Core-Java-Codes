import java.util.Scanner;

class Lower
{
	public static void main(String args[])
	{
		char a, z;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the char: ");
		char i = scan.next().charAt(0);
		if(i>='a' && i<='z')
		System.out.println("this char is lower case:");
		
		else if(i>='A' && i<='Z')
		System.out.println("This char is Upper case:");

		else
		System.out.println("Invalid! this is not a character:");

}
}