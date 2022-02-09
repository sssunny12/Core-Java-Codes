import java.util.*;

class Search
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter a sentence: ");
		String word = scan.nextLine();

		System.out.print("Enter a word to search: ");
		String s = scan.nextLine();

		int i=0;

		while(i<word.length())
		{
		i++;
		}
		if(word.indexOf(s)>=0)
		{
		System.out.println("Yes the word exist:");
		}
		else
		{
		System.out.println("No the word doesn't exist:");
		}
		

		
}
}