import java.util.*;

class Sentence
{
	public static void main(String args[])
	{
	
	int ts=1;
	
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a sentence: ");
	String s = scan.nextLine();

	int i=0;

	while(i<s.length())
	{
	if(s.charAt(i)==' ')
	ts++;

	i++;
	}
	
	System.out.println("total word = " + ts);		
	

}
} 