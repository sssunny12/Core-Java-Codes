import java .util.*;

class Vowels
{
	public static void main(String args[])
	{
		int vowel;
		int consonant;
		int tvowel=0;
		int tconsonant=0;

int a=0, A=0;
int e=0, E=0;
int ii=0, I=0;
int o=0, O=0;
int u=0, U=0;


		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String s = scan.nextLine();

		for(int i=0; i<s.length(); i++)
		{
		if(s.charAt(i)=='a' || s.charAt(i)=='A')
		a++;

		else if(s.charAt(i)=='e' || s.charAt(i)=='E')
		e++;

		else if(s.charAt(i)=='i' || s.charAt(i)=='I')
		ii++;

		else if(s.charAt(i)=='o' || s.charAt(i)=='O')
		o++;

		else if(s.charAt(i)=='u' || s.charAt(i)=='U')
		u++;

		else if(s.charAt(i)==' ')
		tconsonant++;

		tvowel = a+e+ii+o+u;

		}
			System.out.println("a = " + a);
			System.out.println("e = " + e);
			System.out.println("i = " + ii);
			System.out.println("o = " + o);
			System.out.println("u = " + u);
			System.out.println("total vowel = " + tvowel);
			System.out.println("total consonant = " + tconsonant);


}
}