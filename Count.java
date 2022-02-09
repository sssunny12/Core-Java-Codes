import java.util.Scanner;

class Count
{
	public static void main(String args[])
	{
		int tword=1;
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = scan.nextLine();

		int i=0;


		while(i <word.length())
		{

			if(word.charAt(i)== ' ')
				tword++;
		
		i++;
			
		}
		System.out.println("Total Words: " + tword);

}
}