import java.util.*;

class Wordsarray
{
	public static void main(String args[])
	{
		
		int tb=0;

		Scanner scan = new Scanner(System.in);

		String a[] = new String[10];

		for(int i=0; i<10; i++)
		{
		System.out.print("Enter 10 words:" + i +":");
		a[i] = scan.nextLine();
		}
		
		System.out.print("Enter a name to search: ");
		String b = scan.nextLine();

		for(int i=0; i<10; i++)
		{

		if(a[i].indexOf(b)>=0)
			tb++;
		
		}
			System.out.println(b + "=" + tb);
		
		


		
}
}