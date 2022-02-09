import java.util.*;

class Dowhile

{
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		boolean flag=false;
		
		do
		{

		System.out.println("Enter a choice (1 for pizza)");
		System.out.println("Enter a choice (2 for burger)");
		System.out.println("Enter a choice (3 for pasta)");
		System.out.println("Enter a choice (4 for Exit)");

		System.out.print("Enter a choice (1 to 3. 4 for Exit): ");
			int choice = scan.nextInt();
				if(choice==4)
					flag=false;
				else
					flag=true;

		}while(flag==true);
}
}