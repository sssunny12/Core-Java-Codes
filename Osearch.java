import java.util.*;

class Osearch
{
	public static void main(String args[])
	{
		int tw=0;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String s = scan.nextLine();

		System.out.print("Enter a word to search: ");
		String w = scan.nextLine();


		String ss[] = s.split(w);

		int l = ss.length-1;

		System.out.println("Occurence = " + l);
		
}
}