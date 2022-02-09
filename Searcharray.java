import java.util.*;

class Searcharray
{
	public static void main(String args[])
	{
		boolean found=false;

		Scanner scan = new Scanner(System.in);

		String names[] = new String[10];

		for(int i=0; i<names.length; i++)
		{

		System.out.print("Enter the names: " + i + " : ");
		names[i] = scan.nextLine();

		}

		for(int i=0; i<names.length; i++)

		{
		System.out.println(names[i]);
		}

				
		while(true)
		{

		System.out.print("Enter a name to search: ");
		String s = scan.nextLine();

		for(int i=0; i<names.length; i++)
		{
		

		if(names[i].indexOf(s)>=0)
			{
		found=true;			
		break;
			}
		
		else
		{
			found=false;
		}

		
		}
		
	if(found)
	{
	System.out.println("name exists");
	break;
	}

	else
	{
	System.out.println("name does not exists");
	}
}			
}
}