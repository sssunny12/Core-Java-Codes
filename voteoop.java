import java.util.*;

class Vote
{
	String age(int a)
	{
		if(a>=18)
		 return "the person can vote.";
		else	
		return "the person cannot vote.";
	}
		
}

class Marry extends Vote
{
	void gender(String g, int a)
		{
		
		if(g.equals("female") || a>=18)
		{
		System.out.println("girl can marry");
		}

		else
		{
		System.out.println("girl cannot marry");
		}


		
		if(g.equals("male") && a>=21)
		System.out.println("boy can marry");

		

		else 
		System.out.println("boy cannot marry");
		}
		
}


class Voteoop 
{
	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.print("Enter the gender: ");
		String g = scan.nextLine();

		System.out.print("Enter the age: ");
		int a = scan2.nextInt();

	

	Marry obj = new Marry();
	obj.gender(g,a);
		
	

	}		
}