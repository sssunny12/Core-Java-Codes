import java.util.Scanner;

class ABC3
{
	public static void main(String args[])
	{
		MyFunction obj = new MyFunction();

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your fname: ");

		String fname = scan.nextLine();


System.out.print("Enter your age: ");

		int age = scan.nextInt();
		obj.Hello(fname,age);
	}

	
}
class MyFunction
{
void Hello(String fname, int age)
	{
		System.out.println("Welcome! " + fname);
	System.out.println("Age = " + age);
	}
}