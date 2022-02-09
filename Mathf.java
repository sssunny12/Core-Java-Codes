import java.util.*;

class Mathf
{
	public static void main(String args[])
	{
		Mathad obj = new Mathad();
		Mathvsub obj1 = new Mathvsub();
		Mathiadd obj2 = new Mathiadd();
		Mathst obj3 = new Mathst();

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("Enter a choice: ");
		System.out.println("1 for interger: ");
		System.out.println("2 for string: ");
		int ans = scan.nextInt();

		if(ans==1)
		{

		System.out.print("Enter first number: ");
		int num1 = scan.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scan.nextInt();

		obj.add(num1,num2);
		obj1.sub(num1,num2);
		
		int r = obj2.iadd(num1,num2);
		System.out.println("Add = " + r);
		}

		else if(ans==2)
		{
		System.out.print("Enter first name: ");
		String fname = scan2.nextLine();

		System.out.print("Enter last name: ");
		String lname = scan2.nextLine();

		obj3.concat(fname,lname);
		}
		
		
}	

}

class Mathad
{
void add(int num1, int num2)
{
	System.out.println("Sum = " + (num1 + num2));
}
}