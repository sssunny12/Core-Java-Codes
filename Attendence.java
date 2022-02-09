import java.util.Scanner;

class Attendence
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

	
		System.out.print("Enter the number of classes held: ");
		int classes_held = scan.nextInt();

		
		System.out.print("Enter the number of classes attend: ");
		int classes_attend = scan.nextInt();

		int attendence_percentage = classes_attend*100/classes_held;

		System.out.println("Percentage = " + attendence_percentage);		

		if(attendence_percentage>=75)


			System.out.println("Yes student is allowed to sit in exam");
		
		else 
			System.out.println("No student is not allowed to sit in exam");

}
}