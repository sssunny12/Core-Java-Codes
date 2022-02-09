import java.util.*;

class Meaningarray
{
	public static void main(String args[])

	{


		Scanner scan = new Scanner(System.in);

		String a[][] = new String[10][2];

		
		
			a[0][0]= "mango";
			a[0][1]= "aam";
			a[1][0]= "you";
			a[1][1]= "tum";
			a[2][0]= "grapes";
			a[2][1]= "angoor";
			a[3][0]= "lemon";
			a[3][1]= "nimbu";
			a[4][0]= "there";
			a[4][1]= "waha";
			a[5][0]= "here";
			a[5][1]= "yaha";
			a[6][0]= "who";
			a[6][1]= "kaun";
			a[7][0]= "banana";
			a[7][1]= "kela";
			a[8][0]= "potato";
			a[8][1]= "aalu";
			a[9][0]= "mad";
			a[9][1]= "pagal";


		System.out.print("Enter a word to search their meaning: ");
		String b = scan.nextLine();
		
		for(int i=0; i<10; i++)
		{
		
		for(int j=0; j<2; j++)
		{

		if(a[i][j].equals(b))
		{
		j++;
		
		System.out.println(a[i][j]);
		
		}
		}
		}



}
}
