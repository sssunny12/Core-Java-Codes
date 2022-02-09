import java.util.Scanner;

class Search1

{
	public static void main(String args[])

	{
		int tword=0;
		
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the sentence: ");
		String s = scan.nextLine();

		System.out.print("Enter a word to search: ");
		String word = scan.nextLine();

		String ss[]= s.split(word);
int l=ss.length-1;

		System.out.println("Result: " + l);


}




}
