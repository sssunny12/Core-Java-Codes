import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		String word2 ="";

		for(int i=word.length()-1; i>=0; i--)
		word2 += word.charAt(i);
		
		if(word.equals(word2))
		{
		System.out.println("It is palindrome.");
		}
		else
		{
		System.out.println("It is not palindrome.");
		}

		System.out.println(word);

		System.out.println(word2);
		

}
}