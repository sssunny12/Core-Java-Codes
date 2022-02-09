import java.util.*;

class Arithmaticave
{
	public static void main(String args[])
	{
		

		Scanner scan = new Scanner(System.in);

		int number[] = new int[10];
		double total = 0;
		double average = 0;
		for(int i=0; i<10; i++)
		
		{
		System.out.print("Enter numbers: " + i + " : ");
		number[i] = scan.nextInt();

		//total = total + number[i];
		total +=number[i];

		average = (total/10);

		}		

		System.out.println("Total = " + total );

		System.out.println("Average = " + average );



}
}
