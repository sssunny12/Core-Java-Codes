import java.util.Scanner;

class vowels1
{
	public static void main(String args[])

	{
		int i;
		int vowel;
		int consonant;
		int tvowel=0;
		int tconsonant=0;
		
		Scanner scan = new Scanner(System.in);
		
int a=0,A=0;
int ii=0,I=0;
int e=0,E=0;
int o=0,O=0;
int u=0,U=0;


		System.out.print("Enter a word: ");
		String word = scan.nextLine();
	   
		
		for(i=0;i<word.length(); i++)
		{
		if(word.charAt(i)=='a' || word.charAt(i)=='A')
			a++;
			
		else if(word.charAt(i)=='e' || word.charAt(i)=='E')
			e++;
			
		else if(word.charAt(i)=='i' || word.charAt(i)=='I')
			ii++;
			
		else if(word.charAt(i)=='o' || word.charAt(i)=='O')
			o++;
			
		else if(word.charAt(i)=='u' || word.charAt(i)=='U')
			u++;
			
		else
			{
			if(word.charAt(i)!=' ')
			tconsonant++;
			}

		tvowel = a+e+ii+o+u;

}

			System.out.println("a = " + a);
			
			System.out.println("e = " + e);

			System.out.println("i = " + ii);


			System.out.println("o = " + o);

			System.out.println("u = " + u);

			System.out.println("Total Vowels: " + tvowel);
			
			System.out.println("Total Consonants: " + tconsonant);



		
		




		
}
}