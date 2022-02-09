import java.util.Scanner;

class Gradescan
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Marks: ");
		int marks = scan.nextInt();

		
		if(marks>=90 && marks <=100)
			System.out.println("Grade = A ");
		else if(marks>=80)
			System.out.println("Grade = B ");
		else if(marks>=70)
			System.out.println("Grade = C ");
		else if(marks>=60)
			System.out.println("Grade = D ");
		else if(marks>=50)
			System.out.println("Grade = E");
		else
			System.out.println("Fail: ");
	
			
	

}
}